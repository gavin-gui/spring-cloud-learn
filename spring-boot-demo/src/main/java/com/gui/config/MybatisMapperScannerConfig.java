package com.gui.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Created by gui on 2017/1/2.
 */
//@Configuration
////注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
//@AutoConfigureAfter(MybatisConfig.class)
public class MybatisMapperScannerConfig {
    //@Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.gui.mapper");
        return mapperScannerConfigurer;
    }
}
