package com.nikhil.quantitymeasurement.controller;

import com.nikhil.quantitymeasurement.service.*;
import com.nikhil.quantitymeasurement.repository.*;
import com.nikhil.quantitymeasurement.model.*;

public class QuantityMeasurementController {

	private final IQuantityMeasurementService service;

    public QuantityMeasurementController() {
        this.service = new QuantityMeasurementServiceImpl(new QuantityMeasurementCacheRepository());
    }

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2) {
        return service.add(q1, q2);
    }

    public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2) {
        return service.subtract(q1, q2);
    }

    public QuantityDTO convert(QuantityDTO q1, QuantityDTO q2) {
        return service.convert(q1, q2);
    }

    public boolean compare(QuantityDTO q1, QuantityDTO q2) {
        return service.compare(q1, q2);
    }

    public double divide(QuantityDTO q1, QuantityDTO q2) {
        return service.divide(q1, q2);
    }
	
}
