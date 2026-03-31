package model;

public class Circulo {

    private double raio;
    double pi = 3.1415;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return raio;

    }


    public void setRaio(double raio) {
        this.raio = raio;

    }

    public double getArea() {
        return (pi * (getRaio() * getRaio()));

    }
}
