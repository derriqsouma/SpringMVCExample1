package com.springexample.models;

import javax.persistence.*;

/**
 * Created by derric on 5/5/15.
 */

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    
    @Column(name = "first_name")
    private String fname;
    
    private String last_name;
    
    private String email;
    
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

