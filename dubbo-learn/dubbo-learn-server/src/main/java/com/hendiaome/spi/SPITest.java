package com.hendiaome.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.hendiaome.api.TestService;

/**
 * 描述
 *
 * @author zhaotianming1
 * @date 2019/1/9
 */
public class SPITest {

    public static void main(String[] args) {
        ExtensionLoader<TestService> extensionLoader = ExtensionLoader.getExtensionLoader(TestService.class);
        TestService test = extensionLoader.getExtension("test");

        System.out.println();
    }

}
