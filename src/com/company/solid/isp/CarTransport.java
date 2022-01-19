package com.company.solid.isp;

import com.company.solid.isp.vehicle.Car;
import com.company.solid.isp.vehicle.IVehicle;

public class CarTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
