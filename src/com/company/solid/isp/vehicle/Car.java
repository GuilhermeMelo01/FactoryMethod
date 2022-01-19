package com.company.solid.isp.vehicle;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros, estamos prontos");
    }
}
