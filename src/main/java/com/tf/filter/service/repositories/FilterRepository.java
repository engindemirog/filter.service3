package com.tf.filter.service.repositories;

import com.tf.filter.service.entities.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilterRepository extends MongoRepository<Inventory,String> {
}
