package com.springsec.springsecjpadb.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

//@Entity
//@Table(name = "users")
public class secUser {
    private int id;
    private int userid;
    private int userName;
    private int password;
    private int empid;
    private boolean isadmin;
    private Set<UserRole> role;
}
