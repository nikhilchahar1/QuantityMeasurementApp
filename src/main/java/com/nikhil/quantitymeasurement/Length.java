package com.nikhil.quantitymeasurement;

public class Length {
	private double value;
	private LengthUnit unit;
	private static final double EPSILON = 0.0001;
	
	public enum LengthUnit{
		FEET(12.0), INCHES(1.0), YARDS(36.0), CENTIMETERS(0.393701);
		private final double conversionFactor;
		
		LengthUnit(double conversionFactor){
			this.conversionFactor = conversionFactor;
		}
		
		public double getConversionFactor() {
			return conversionFactor;
		}
	}
	
	public Length(double value, LengthUnit unit) {
		if(value < 0) throw new IllegalArgumentException("Length can not be less then zero or negative");
		if(unit == null) throw new IllegalArgumentException("Unit can not be null");
		this.value = value;
		this.unit = unit;
	}
	
	private double convertToBaseUnit() {
		return value * unit.getConversionFactor();
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(getClass() != o.getClass()) {
			return false;
		}
		Length other = (Length) o;
		return Math.abs(this.convertToBaseUnit() - other.convertToBaseUnit()) < EPSILON;
	}
	
	@Override
	public int hashCode() {
		return Double.hashCode(convertToBaseUnit());
	}
	
	@Override
	public String toString() {
		return value + " " +unit;
	}
	
	public double convertTo(LengthUnit targetUnit) {
		if(targetUnit == null) {
			throw new IllegalArgumentException("Unit can't be null");
		}
		double baseValue = convertToBaseUnit();
		return baseValue/targetUnit.getConversionFactor();
	}
	
	public Length add(Length other) {
		if(other == null) throw new IllegalArgumentException("Length cant be null");
		double result = (this.convertToBaseUnit() + other.convertToBaseUnit())/this.unit.getConversionFactor();
		return new Length(result, this.unit);
	}

}