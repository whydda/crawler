package com.example.crawler.core.config;

import java.io.IOException;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.*;

/**
 * Created by whydda on 2017-11-07.
 * File Ko Name :
 */

@Configuration
public class MongoConfig {

    private static final String MONGO_DB_URL = "127.0.0.1";
    private static final String MONGO_DB_NAME = "local";
    private static final int MONGO_DB_PORT = 27017;
    @Bean
    public MongoTemplate mongoTemplate() throws IOException {
        MongoClient mongoClient = new MongoClient(MONGO_DB_URL, MONGO_DB_PORT);
        MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClient, MONGO_DB_NAME);
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
        return mongoTemplate;
    }
}