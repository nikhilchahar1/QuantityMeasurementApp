package com.nikhil.quantitymeasurement;

public class Length {
	
	private double value;
	private LengthUnit unit;
	
	public enum LengthUnit{
		FEET(12.0), INCHES(1.0);
		
		private final double conversionFactor;
		
		LengthUnit(double conversionFactor){
			this.conversionFactor=conversionFactor;
		}
		
		public double getConversionFactor() {
			return conversionFactor;
		}
	}
	
	public Length(double value,LengthUnit unit) {
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
		return Double.compare(this.convertToBaseUnit(),other.convertToBaseUnit()) == 0;
	}
	
	@Override
	public int hashCode() {
		return Double.hashCode(convertToBaseUnit());
	}

}