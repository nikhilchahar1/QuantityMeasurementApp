package com.nikhil.quantitymeasurement.repository;

import com.nikhil.quantitymeasurement.model.QuantityMeasurementEntity;
import java.util.*;

public class QuantityMeasurementCacheRepository implements IQuantityMeasurementRepository{
	
	private List<QuantityMeasurementEntity> cache = new ArrayList<>();
	
	@Override
	public void save(QuantityMeasurementEntity instance) {
		cache.add(instance);
		System.out.println(instance+" saved!!");
	}
	
	
}
