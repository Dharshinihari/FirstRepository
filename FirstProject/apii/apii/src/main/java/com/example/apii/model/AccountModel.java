package com.example.apii.model;

import com.example.apii.repository.AccountRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;


@Document("account")
public class AccountModel
{
    @Id
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Integer accountid;
    private String name;

    public AccountModel( )
    {


    }
    public AccountModel(Integer accountid,String name) {
        this.accountid = accountid;
        this.name = name;
    }
    @JsonProperty("accountid")
    public Integer getaccountid() {
        return accountid;
    }

    public void setaccountid(Integer accountid) {
        this.accountid = accountid;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}