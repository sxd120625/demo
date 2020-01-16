package com.example.demo;

import com.example.demo.service.observer.EntryService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 访问接口
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EntryServicetest {
    @Autowired
    EntryService entryService;

    @Test
    public void test() {
        entryService.test();
    }

}
