package com.sai.DS;

import java.util.ArrayList;
import java.util.List;


class VehicleStore {

    List<Vehicle> list = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        list.add(v);
    }

    public List<Vehicle> getAll() {
        return list;
    }
}