package dev.rifaii.mybatisbug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
public class TestMybatisBugApplication {

    @Bean
    @ServiceConnection
    @RestartScope
    public PostgreSQLContainer<?> postgreSQLContainer() {
        return new PostgreSQLContainer("postgres:15.1-alpine");
    }

    public static void main(String[] args) {
        SpringApplication.from(MybatisBugApplication::main)
                .with(TestMybatisBugApplication.class)
                .run(args);
    }

}
