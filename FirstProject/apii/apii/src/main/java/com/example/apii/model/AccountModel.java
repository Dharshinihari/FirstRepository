package com.example.apii.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountModel {
    private String accountid;
    private String name;
    private String isactive;
    private String total;


    public AccountModel() {
    }
    public AccountModel(String name, String accountid, String isactive, String total) {
        this.accountid = accountid;
        this.name = name;
        this.isactive = isactive;
        this.total = total;


    }


    @JsonProperty("name")
    public String getName() {return this.name;}
    @JsonProperty("accountid")
    public String  getaccountid()  {return this.accountid;}
    @JsonProperty("isactive")
    public String getIsactive() {return this.isactive;}
    @JsonProperty("total")
    public String getTotal() {return this.total;}


    public void setName(String name) {this.name = name;}
    public void setaccountid(String  accountid) {this.accountid = accountid;}
    public void setIsactive(String isactive) {this.isactive = isactive;}
    public void setTotal(String total) {this.total = total;}






}
