package com.example.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value={"com.example.demo.dao"})
public class SpringAppApplication {
	
	private static Logger logger = LogManager.getLogger( SpringAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}
	
	  @Bean
	    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
	        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource);
	        
//	        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
	        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml");
	        sessionFactory.setMapperLocations(res);
	        return sessionFactory.getObject();
	    }

}

