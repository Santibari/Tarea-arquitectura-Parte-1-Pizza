/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;

public class PizzaIntegral extends Pizza {
    @Override
    public Amasar createAmasarPizza() {
        return new AmasadoGeneral("Integral");
    }

    @Override
    public Hornear createHornearPizza() {
        return new HorneadoGeneral("Integral");
    }

    @Override
    public Moldear createMoldearPizza() {
        return new MoldeadoGeneral("Integral");
    }
}