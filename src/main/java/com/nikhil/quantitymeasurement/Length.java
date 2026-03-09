package com.nikhil.quantitymeasurement;

public class Length {
	
	private double value;
	private LengthUnit unit;
	private static final double EPSILON = 0.0001;
	
	public Length(double value, LengthUnit unit) {
		if(!Double.isFinite(value)) throw new IllegalArgumentException("Value should be finite");
		if(unit == null) throw new IllegalArgumentException("Unit can't be null");
		this.value = value;
		this.unit = unit;
	}
	
	private double convertToBaseUnit() {
		return unit.toBase(value); 
	}
	
	public double getValue() {
		return value;
	}
	
	public LengthUnit getUnit() {
		return unit;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Length other = (Length) obj;
		return Math.abs(this.convertToBaseUnit() - other.convertToBaseUnit()) < EPSILON;
	}
	
	@Override
	public int hashCode() {
		return Long.hashCode(Math.round(convertToBaseUnit() / EPSILON));
	}
	
	@Override
	public String toString() {
		return Math.round(value*100.0)/100.0 +" "+ unit;
	}
	
	public double convertTo(LengthUnit targetUnit) {
		if(targetUnit == null) {
			throw new IllegalArgumentException("Unit cannot be null");
		}
		double baseValue = convertToBaseUnit();
		return targetUnit.fromBase(baseValue);
	}
	
	public Length add(Length other) {
		return add(other, this.unit);
	}
	
	public Length add(Length other, LengthUnit targetUnit) {
		if(other == null) {
			throw new IllegalArgumentException("Length can't be null");
		}
		if(targetUnit == null) {
			throw new IllegalArgumentException("Unit can't be null");
		}
		double result = this.convertToBaseUnit() + other.convertToBaseUnit();
		result = targetUnit.fromBase(result);
		return new Length(result, targetUnit);
	}
}