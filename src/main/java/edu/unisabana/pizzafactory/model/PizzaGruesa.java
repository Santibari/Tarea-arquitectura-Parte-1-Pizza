/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;

public class PizzaGruesa extends Pizza {
    @Override
    public Amasar createAmasarPizza() {
        return new AmasadoGeneral("Gruesa");
    }

    @Override
    public Hornear createHornearPizza() {
        return new HorneadoGeneral("Gruesa");
    }

    @Override
    public Moldear createMoldearPizza() {
        return new MoldeadoGeneral("Gruesa");
    }
}
