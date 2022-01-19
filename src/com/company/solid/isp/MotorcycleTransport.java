package com.company.solid.isp;

import com.company.solid.isp.vehicle.IVehicle;
import com.company.solid.isp.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
