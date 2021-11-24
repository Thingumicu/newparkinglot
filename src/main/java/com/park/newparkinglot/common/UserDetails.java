/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.park.newparkinglot.common;

import java.io.Serializable;

/**
 *
 * @author radvo
 */
public class UserDetails implements Serializable{
    
    private Integer id;
    private String username;
    private String email;
    private String position;

    public UserDetails(Integer id, String username, String email, String position) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.position = position;
    }

    public Integer getId() {
        return id;
    }
    
    
}
