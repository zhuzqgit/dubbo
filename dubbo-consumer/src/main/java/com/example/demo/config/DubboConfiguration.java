package com.example.demo.config;

/**
 * @author zhuzhiqiang
 * @date 2019/6/17 19:24
 * @email zhu_zq@aliyun.com
 */
//@Configuration
//@ConditionalOnClass({AnnotationBean.class,ApplicationConfig.class, ProtocolConfig.class,RegistryConfig.class})
public class DubboConfiguration {

//    @Bean
//    @ConditionalOnMissingBean(ApplicationConfig.class)
//    public ApplicationConfig applicationConfig(){
//        ApplicationConfig config = new ApplicationConfig();
//        config.setName("consumer");
//        return config;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(AnnotationBean.class)
//    public AnnotationBean annotationBean(){
//        AnnotationBean bean = new AnnotationBean();
//        bean.setPackage("com.alibaba.dubbo");
//        return bean;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(RegistryConfig.class)
//    public RegistryConfig registryConfig(){
//        RegistryConfig config = new RegistryConfig();
//        config.setAddress("zookeeper://127.0.0.1:2181");
//        config.setClient("curator");
//        return config;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(ConsumerConfig.class)
//    public ConsumerConfig consumerConfig(){
//        ConsumerConfig config = new ConsumerConfig();
//        config.setTimeout(3000);
//        return config;
//    }
}
