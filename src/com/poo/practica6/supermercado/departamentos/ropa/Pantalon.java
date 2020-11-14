package com.poo.practica6.supermercado.departamentos.ropa;

public class Pantalon extends Ropa {
    private String tipo;
    private int numBolsillos;

    public Pantalon(String tamano, String color, String genero, String material, String tipo, int numBolsillos) {
        super(tamano, color, genero, material);
        this.tipo = tipo;
        this.numBolsillos = numBolsillos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumBolsillos() {
        return numBolsillos;
    }

    public void setNumBolsillos(int numBolsillos) {
        this.numBolsillos = numBolsillos;
    }
}
