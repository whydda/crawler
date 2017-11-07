package com.example.crawler.vo;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by whydda on 2017-11-07.
 * File Ko Name :
 */
@Document
public class UserVo {
    String id;
    String passwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
