package com.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.config
 * @ClassName: MybatisConfig
 * @Author: gnnt
 * @Date: 2019/1/25 17:18
 * @Version: 1.0
 */
@Configuration
public class MybatisConfig {

    /**
     * 设置mybatis自动装配的驼峰识别
     *
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
