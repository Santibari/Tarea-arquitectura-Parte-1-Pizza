/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model;

/**
 *
 * @author USUARIO
 */
public class AmasadoGeneral implements Amasar {
    private String tipoMasa;

    public AmasadoGeneral(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void amasar() {
        System.out.println("Amasando pizza de masa " + tipoMasa + "...");
    }
}

