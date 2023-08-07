package com.wbpet.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "usr_user")
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class User extends BaseEntity {

    @Column(name = "str_login", unique = true)
    private String login;
    @Column(name = "str_email", unique = true)
    private String email;

}
