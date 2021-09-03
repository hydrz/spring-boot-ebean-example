package cn.hydrz.demo;

import java.util.List;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.spring.txn.SpringJdbcTransactionManager;

@SpringBootApplication
public class DemoApplication {
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Mode.OFF);
        app.run(args);
    }

    @Autowired
    private DataSource dataSource;

    @Bean
    public Database getDatabase() {
        DatabaseConfig config = new DatabaseConfig();
        config.loadFromProperties();
        config.setDataSource(dataSource);
        config.setPackages(List.of(this.getClass().getPackage().getName()));
        config.setExternalTransactionManager(new SpringJdbcTransactionManager());
        config.setRunMigration(true);
        return DatabaseFactory.create(config);
    }

}
