package com.hendiaome.api;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface TestService {

    String test(String arg);
}
