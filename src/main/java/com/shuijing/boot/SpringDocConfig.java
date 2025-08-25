package com.shuijing.boot;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("黄骏的SpringDoc")
                        .description("学习一下怎么用SpringDoc")
                        .version("1.0")
                        .contact(new Contact()
                                .name("黄骏")
                                .email("41293877@qq.com")));
    }
}
