package edu.unisabana.pizzafactory.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class HorneadoGeneral implements Hornear {
    private String tipoMasa;

    public HorneadoGeneral(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void hornear() {
        System.out.println("Horneando pizza de masa " + tipoMasa + "...");
    }
}

