package com.ysity.example.demo.domain;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="table_user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue()
    private Integer userId;
    private String userNickname;
    private String userPassword;
    private String userEmail;
    private Integer actiStates;

    public static final int ACTIVATION_SUCCESSFUL = 1;
    public static final int ACTIVATION_UNSUCCESSFUL = 0;

    private String actiCode;
    private Date tokenExptime;
}
