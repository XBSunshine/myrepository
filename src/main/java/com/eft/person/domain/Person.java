package com.eft.person.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Person {
    private Integer id;
    private String name;
    private  String address;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date date;

    public Person() {
    }

    public Person(Integer id,String name, String address, Date date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                '}';
    }
}
