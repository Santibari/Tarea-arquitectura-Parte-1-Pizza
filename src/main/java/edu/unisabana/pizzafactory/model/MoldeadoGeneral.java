package edu.unisabana.pizzafactory.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class MoldeadoGeneral implements Moldear {
    private String tipoMasa;

    public MoldeadoGeneral(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void moldearPizzaMediana() {
        System.out.println("Moldeando pizza mediana de masa " + tipoMasa + "...");
    }

    @Override
    public void moldearPizzaPequeña() {
        System.out.println("Moldeando pizza pequeña de masa " + tipoMasa + "...");
    }
}

