package com.example.mapa;

public class Veiculos {
    private int id;
    private String descrição;
    private String placa;
    private int odometro;
    public void setId(int id) {
        this.id =id;
    }
    public void setDescrição (String descrição){
        this.descrição =descrição;
    }
    public void setPlaca (String placa){
        this.placa =placa;
    }
    public void setOdometro (int odometro){
        this.odometro =odometro;
    }
    public int getId() {
        return this.id;
    }
    public String getDescrição() {
        return this.descrição;
    }
    public String getPlaca() {
        return this.placa;
    }
    public int getOdometro () {
        return this.odometro;
    }
}

