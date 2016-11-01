package com.example.guestbook;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.lang.String;
import java.util.Date;
import java.util.List;


@Entity
public class Register {
    @Id
    public Long id;
    public String Email;
    public String Password;

    public Register(){}
    public Register(String email, String password) {
        Email = email;
        Password = password;
    }
}
