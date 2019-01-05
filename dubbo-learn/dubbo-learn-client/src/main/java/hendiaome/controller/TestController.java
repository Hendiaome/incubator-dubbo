package hendiaome.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hendiaome.api.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/dubbo/test")
    public Object test() {
        return testService.test("hello");
    }
}
