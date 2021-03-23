package com.chryl.module.test.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class ZgInfo implements Serializable {

    private Integer id;

    private String zgname;

    private String zgcode;

    private Date zgdate;

    private Timestamp zgutime;

    private Timestamp zgetime;

    private String zgsord;

}