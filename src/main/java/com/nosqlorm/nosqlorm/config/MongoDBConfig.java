package com.nosqlorm.nosqlorm.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration {


    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString(
                "mongodb+srv://Giuseppe1234:1234giuseppe@cluster0.6hzpmxm.mongodb.net/?retryWrites=true&w=majority"
        );
        MongoClientSettings mongoClientSettings = mongoClientSettings().builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

        @Override
    protected String getDatabaseName() {
        return "DevelhopeExercise";
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("co.nosqlorm");
    }
}
