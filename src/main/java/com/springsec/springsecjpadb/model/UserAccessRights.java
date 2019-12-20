package com.springsec.springsecjpadb.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

//@Entity
//@Table(name = "access_right")
public class UserAccessRights {
    private int id;
    private String description;
    private String code;
    private GrantedAuthority getAuthorities = new SimpleGrantedAuthority("ROLES_"+this.code);
}
