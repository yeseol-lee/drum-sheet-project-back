package com.dororok.drumsheetmusic.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.username("boot");
        dataSourceBuilder.password("password");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/drumsheet?serverTimezone=Asia/Seoul&useUnicode=true&characterEncoding=UTF-8");

        return dataSourceBuilder.build();
    }
}