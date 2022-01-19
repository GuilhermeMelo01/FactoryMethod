package com.company.solid.isp;

import com.company.solid.isp.vehicle.Bike;
import com.company.solid.isp.vehicle.IVehicle;

public class BikeTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
