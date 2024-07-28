/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cis18a.finalproject;

/**
 *
 * @author paolo
 */
public abstract class Character {
    //The variable characters have
    public String name;
    public int trust;
    //Constructor
    public Character(String name, int trust)
    {
        this.name = name;
        this.trust = trust;
    }
}
