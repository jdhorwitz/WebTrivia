package com.jhorwitz.trivia.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sql.DataSource;

@Configuration
@ComponentScan({ "com.trivia.configuration" })
@PropertySource(value = { "classpath:application.properties" })
public class JPAConfiguration {

    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("WebTrivia");
    static EntityManager em = entityManagerFactory.createEntityManager();
    static EntityTransaction userTransaction = em.getTransaction();


}
     

