package com.recon.community.config;

import com.recon.community.interceptor.CommunityInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author daniel.xue
 * @create 2018/7/16
 **/
@Configuration
public class CommunityInterceptorConfig extends WebMvcConfigurerAdapter {

    @Bean
    public CommunityInterceptor communityInterceptor() {
        return new CommunityInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(communityInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/community/user/login")
                .excludePathPatterns("/*swagger-**")
                .excludePathPatterns("/swagger-resources")
                .excludePathPatterns("/**/api-docs")
                .excludePathPatterns("/configuration/**");
        super.addInterceptors(registry);
    }
}
