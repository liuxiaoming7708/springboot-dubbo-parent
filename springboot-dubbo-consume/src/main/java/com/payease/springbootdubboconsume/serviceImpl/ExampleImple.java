package com.payease.springbootdubboconsume.serviceImpl;

import com.payease.springbootdubboapi.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created By liuxiaoming
 * @CreateTime 2017/12/19 下午5:41
 **/
@RestController
public class ExampleImple {
    @Autowired
    private ExampleService exampleService;

    @GetMapping("/index")
    public String aaa() {
        return exampleService.aaa();
    }
}
