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

	public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(Quantity<U> q1, Quantity<U> q2, U targetUnit){
		return q1.subtract(q2, targetUnit);
	}
	
	public static <U extends IMeasurable> Quantity<U> demonstrateSubtraction(Quantity<U> q1, Quantity<U> q2){
		return q1.subtract(q2);
	}
	
	public static <U extends IMeasurable> double demonstrateDivision(Quantity<U> q1, Quantity<U> q2) {
		return q1.divide(q2);
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
		
		//Demonstrate subtraction of two quantities and return the result
		System.out.println("Converted length after subtraction : "+demonstrateSubtraction(lengthInInches, lengthInFeet));
		
		System.out.println("Converted length into target unit after subtraction : "+demonstrateSubtraction(lengthInInches, lengthInFeet, LengthUnit.CENTIMETERS));
		
		System.out.println("Converted length after addition : "+demonstrateDivision(lengthInInches, lengthInFeet));
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
		
		System.out.println("Converted weight in Milligrams : "+demonstrateAddition(weightInGrams, weightInKilograms, WeightUnit.MILLIGRAM));
		
		System.out.println("Converted weight after subtraction : "+demonstrateSubtraction(weightInGrams, weightInKilograms));
		
		System.out.println("Converted weight into target unit after subtraction : "+demonstrateSubtraction(weightInGrams,weightInKilograms,WeightUnit.MILLIGRAM));
		
		System.out.println("Converted weight after division : "+demonstrateDivision(weightInGrams,weightInKilograms));
		System.out.println();
		
		// Now for Volume
		Quantity<VolumeUnit> volumeInML = new Quantity<>(1000.0,VolumeUnit.MILLILITRE);
		Quantity<VolumeUnit> volumeInL = new Quantity<>(1.0,VolumeUnit.LITRE);
		System.out.println("Volume in Millilitre : "+volumeInML+"\nVolume in Litre : "+volumeInL);
		boolean areVolumeEqual = demonstrateEquality(volumeInML, volumeInL);
		System.out.println("Are volumes equal: "+areVolumeEqual);
		
		Quantity<VolumeUnit> convertedVolume = demonstrateConversion(volumeInML,VolumeUnit.LITRE);
		System.out.println("Volume in millilitres converted in Litre : "+convertedVolume);
		
		System.out.println("Converted volume(in unit of first quantity) after addition of both volume : "+demonstrateAddition(volumeInML, volumeInL));
		
		System.out.println("Converted volume in Gallon : "+demonstrateAddition(volumeInML,volumeInL,VolumeUnit.GALLON));
		
		System.out.println("Converted volume after subtraction : "+demonstrateSubtraction(volumeInML, volumeInL));
	
		System.out.println("Converted volume into target unit after subtraction : "+demonstrateSubtraction(volumeInL, volumeInML, VolumeUnit.MILLILITRE));

		System.out.println("Converted volume after division : "+demonstrateDivision(weightInGrams,weightInKilograms));
		System.out.println();
		
		//Temperature 
		Quantity<TemperatureUnit> q1 = new Quantity<>(0.0, TemperatureUnit.CELSIUS);
		Quantity<TemperatureUnit> q2 = new Quantity<>(32.0, TemperatureUnit.FAHRENHEIT);
		System.out.println("0 C equals 32 F: "+q1.equals(q2));
		
		Quantity<TemperatureUnit> celsius= new Quantity<>(100.0, TemperatureUnit.CELSIUS);
		Quantity<TemperatureUnit> fahrenheit= demonstrateConversion(celsius,TemperatureUnit.FAHRENHEIT);
		System.out.println("Coverted 100 C to fahrenheit = "+fahrenheit);

		try {
			demonstrateAddition(celsius,new Quantity<>(50.0, TemperatureUnit.CELSIUS));
		}catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		
	}

} 
