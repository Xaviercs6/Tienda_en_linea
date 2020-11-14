package com.poo.practica6.supermercado.departamentos.papeleria;

import com.poo.practica6.supermercado.departamentos.Productos;

public class Hojas extends Productos{
    private int numeroHojas;
    private float porcentajeBlancura;

    public Hojas(){
        setPrecio((float) 113.00);
        setCodigoIdentificacion("HX99PB");
        setMarca("XEROX");
        setnumeroHojas(500);
        setPorcentajeBlancura((float)99.9);
    }

    public void setnumeroHojas(int numeroHojas){
        this.numeroHojas = numeroHojas;
    }

    public int getNumeroHojas(){
        return numeroHojas;
    }

    public void setPorcentajeBlancura(float porcentajeBlancura){
        this.porcentajeBlancura = porcentajeBlancura;
    }

    public float getPorcentajeBlancura(){
        return porcentajeBlancura;
    }
}
