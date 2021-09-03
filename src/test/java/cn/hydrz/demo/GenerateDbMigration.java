package cn.hydrz.demo;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.ebean.annotation.Platform;
import io.ebean.dbmigration.DbMigration;

@SpringBootTest
public class GenerateDbMigration {

    @Test
    void generateDbMigration() throws IOException {
        DbMigration dbMigration = DbMigration.create();
        dbMigration.setPlatform(Platform.MYSQL);
        dbMigration.generateMigration();
    }
}