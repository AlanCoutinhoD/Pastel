package com.upchiapas;
public class Postre {
    private  int folio;
    private  String nombrePostre;
    private  String ingrediente;
    public  int getFolio() {
        return folio;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public Postre(int folio, String nombrePostre, String ingrediente){
        this.folio=folio;
        this.nombrePostre= nombrePostre;
        this.ingrediente= ingrediente;
    }

}




