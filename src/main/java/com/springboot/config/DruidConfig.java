package com.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: springboot-web-mybatis
 * @Package: com.springboot.config
 * @ClassName: DruidConfig
 * @Author: gnnt
 * @Date: 2019/1/25 16:38
 * @Version: 1.0
 */
@Configuration
public class DruidConfig {

    /**
     * 自定义数据源
     *
     * @return
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    /*配置druid监听器*/

    /**
     * 1配置后台的servlet处理器
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        Map<String, Object> initParams = new HashMap<>();

        //设置初始化参数
        initParams.put("loginUsername", "admin");
        initParams.put("loginPassword", "admin");
        initParams.put("allow", "");//默认允许所有访问
        initParams.put("deny", "172.18.1.120");

        bean.setInitParameters(initParams);

        return bean;
    }

    /**
     * 配置监听器的filter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());

        Map<String, Object> initParams = new HashMap<>();

        //设置初始化参数
        initParams.put("exclusions", ".js,.css,/druid/*");

        bean.setInitParameters(initParams);
        return bean;
    }
}
