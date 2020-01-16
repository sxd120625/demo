package com.example.demo.config.db;

import com.alibaba.druid.pool.DruidDataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = MisDataSourceConfig.PACKAGE,
        sqlSessionFactoryRef = "misSqlSessionFactory")
public class MisDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.hualala.mis.check.mapper";
    static final String MAPPER_LOCATION = "classpath:com/hualala/mis/mapper/*.xml";
    static final String CONFIG_LOCATION = "classpath:mybatis-config.xml";

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Autowired
    private ResourceLoader resourceLoader = new DefaultResourceLoader();

    @Bean(name = "misDataSource")
    @Primary
    public DataSource misDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "basicTransactionManager")
    @Primary
    public DataSourceTransactionManager misTransactionManager() {
        return new DataSourceTransactionManager(misDataSource());
    }

    @Bean(name = "misSqlSessionFactory")
    @Primary
    public SqlSessionFactory misSqlSessionFactory(
            @Qualifier("misDataSource") DataSource misDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(misDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MisDataSourceConfig.MAPPER_LOCATION));
        sessionFactory.setConfigLocation(resourceLoader.getResource(CONFIG_LOCATION));
        return sessionFactory.getObject();
    }
}
