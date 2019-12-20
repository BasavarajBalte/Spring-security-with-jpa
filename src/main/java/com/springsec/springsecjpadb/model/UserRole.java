package com.springsec.springsecjpadb.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

//@Entity
//@Table(name = "roles")
public class UserRole {
    int id;
    private String name;
    private LocalDate lastupdate;
    private boolean isPrivate;
    private boolean issystem;
    private String description;

    private Set<UserAccessRights> accessRights;
}
