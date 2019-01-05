package hendiaome;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@EnableDubboConfiguration
@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run();
    }
/*
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/
}
