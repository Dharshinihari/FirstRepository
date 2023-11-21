package com.example.apii.repository;

import com.example.apii.model.AccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountModel, String >{

}
