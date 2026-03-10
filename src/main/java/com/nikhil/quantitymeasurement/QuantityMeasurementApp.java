package com.nikhil.quantitymeasurement;

public class QuantityMeasurementApp {
	
	public static <U extends IMeasurable> boolean demonstrateEquality(Quantity<U> q1, Quantity<U> q2) {
		if(q1.equals(q2)) return true;
		return false;
	}
	
	public static <U extends IMeasurable> Quantity<U> demonstrateConversion(Quantity<U> q, U targetUnit){
		return new Quantity<>(q.convertTo(targetUnit), targetUnit);
	}
	
	public static <U extends IMeasurable> Quantity<U> demonstrateAddition(Quantity<U> q1, Quantity<U> q2){
		return q1.add(q2);
	}
	
	public static <U extends IMeasurable> Quantity<U> demonstrateAddition(Quantity<U> q1, Quantity<U> q2, U targetUnit){
		return q1.add(q2, targetUnit);
	}

	public static void main(String[] args) {
		
		// For Length
		Quantity<LengthUnit> lengthInInches = new Quantity<>(12.0, LengthUnit.INCHES);
		Quantity<LengthUnit> lengthInFeet = new Quantity<>(1.0, LengthUnit.FEET);
		System.out.println("Length in inches : "+lengthInInches+"\nLength in Feet : "+lengthInFeet);
		boolean areEqualLength = demonstrateEquality(lengthInInches, lengthInFeet);
		System.out.println("Are lengths equal : "+areEqualLength);
		
		//Demonstrate conversion between two quantities
		Quantity<LengthUnit> convertedLength = demonstrateConversion(lengthInInches, LengthUnit.FEET);
		System.out.println("Length in Inches converted in Feet : "+convertedLength);
		
		//Demonstrate addition of two quantities and return the result in the unit of first quantity
		System.out.println("Converted length(in unit of first quantity) after addition of both lengths : "+demonstrateAddition(lengthInInches, lengthInFeet));
				
		//Demonstrate addition of two quantities and return the result in the target unit
		System.out.println("Converted length in Centimeters : "+demonstrateAddition(lengthInInches, lengthInFeet, LengthUnit.CENTIMETERS));
		System.out.println();
		
		//Same for Weight
		Quantity<WeightUnit> weightInGrams = new Quantity<>(1000.0,WeightUnit.GRAM);
		Quantity<WeightUnit> weightInKilograms = new Quantity<>(1.0,WeightUnit.KILOGRAM);
		System.out.println("Weight in Grams : "+weightInGrams+"\nWeight in KiloGrams : "+weightInKilograms);
		boolean areEqualWeight = demonstrateEquality(weightInGrams,weightInKilograms);
		System.out.println("Are weights equal: "+areEqualWeight);
		
		Quantity<WeightUnit> convertedWeight = demonstrateConversion(weightInGrams, WeightUnit.KILOGRAM);
		System.out.println("Weight in grams converted in Kilograms : "+convertedWeight);
		
		System.out.println("Converted weight(in unit of first quantity) after addition of both weights : "+demonstrateAddition(weightInGrams, weightInKilograms));
		
		System.out.println("Converted length in Milligrams : "+demonstrateAddition(weightInGrams, weightInKilograms, WeightUnit.MILLIGRAM));
	}

} 
