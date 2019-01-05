package com.hendiaome.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hendiaome.api.TestService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public String test(String arg) {
        return "服务端收到: " + arg;
    }
}

