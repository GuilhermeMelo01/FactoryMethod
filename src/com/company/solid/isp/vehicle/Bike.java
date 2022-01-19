package com.company.solid.isp.vehicle;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a comida");
    }
}
