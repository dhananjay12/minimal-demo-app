package com.djcodes.spring.demoapp.data;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface FortuneRepository extends MongoRepository<Fortune, Integer> {

}
