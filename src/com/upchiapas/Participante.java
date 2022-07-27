package com.upchiapas;
public class Participante {
   private String nombre;
    private int folio;
    private String nombrePostre;
    private String lugar;
    public String getNombre(){return nombre;}
    public int getFolio(){return folio;}
    public Participante (int folio , String nombre,String lugar) {
        this.nombre = nombre;
        this.folio = folio;
        this.lugar=lugar;
    }
    public String getNombrePostre() {
        return nombrePostre;
    }
    public String getLugar() {
        return lugar;
    }
}
