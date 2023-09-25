package com.deee.deeee.repository;

import com.deee.deeee.model.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractRepository extends MongoRepository<Contract, String> {
}
