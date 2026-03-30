package com.nikhil.quantitymeasurement.model;

import com.nikhil.quantitymeasurement.model.QuantityModel;

public class QuantityMeasurementEntity {
	
	private QuantityModel operand1;
	private QuantityModel operand2;
	private String operation;
	private QuantityModel result;
	
	public QuantityMeasurementEntity(QuantityModel o1, QuantityModel o2, String operation, QuantityModel result) {
		this.operand1 = o1;
		this.operand2 = o2;
		this.operation = operation;
		this.result = result;
	}
	
	@Override
    public String toString() {
        return operand1.getValue() + " " + operand1.getUnit() + " "+ operation + " "+ operand2.getValue() + " " + operand2.getUnit() + " = " + result.getValue() + " " + result.getUnit();
    }
	
}
