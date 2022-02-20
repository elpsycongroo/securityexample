package com.dominicpoi.security.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Bean(name = "securityDataSource")
    @Qualifier("securityDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource securityDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }


}
