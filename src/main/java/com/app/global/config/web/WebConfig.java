package com.app.global.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") //CORS 허용 패턴 지정
//                .allowedOrigins("http://localhost:8082") //허용할 origin 지정, "*" : 모든 출처 허용
                .allowedOrigins("*") //허용할 origin 지정, "*" : 모든 출처 허용
                .allowedMethods(
                        HttpMethod.GET.name(),
                        HttpMethod.POST.name(),
                        HttpMethod.PUT.name(),
                        HttpMethod.PATCH.name(),
                        HttpMethod.DELETE.name(),
                        HttpMethod.OPTIONS.name()
                ).maxAge(3600);
    }
}
