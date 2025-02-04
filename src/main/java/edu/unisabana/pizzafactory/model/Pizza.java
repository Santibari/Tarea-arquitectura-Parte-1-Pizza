/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;


public abstract class Pizza {
    public abstract Amasar createAmasarPizza();
    public abstract Hornear createHornearPizza();
    public abstract Moldear createMoldearPizza();

    public void prepararPizza() {
        createAmasarPizza().amasar();
        createMoldearPizza().moldearPizzaMediana(); // O usar moldearPizzaPequeña según el tamaño
        createHornearPizza().hornear();
    }
}


   