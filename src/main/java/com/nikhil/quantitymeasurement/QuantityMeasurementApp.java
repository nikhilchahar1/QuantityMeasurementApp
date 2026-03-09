package com.nikhil.quantitymeasurement;

public class QuantityMeasurementApp {
	
	public static void demonstrateFeetEquality() {
		
		Length feet1 = new Length(23.01, Length.LengthUnit.FEET);
		Length feet2 = new Length(23.01, Length.LengthUnit.FEET);
		System.out.print("Feet: ");
		
		if(feet1.equals(feet2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
	
	public static void demonstrateInchesEquality() {
		Length i1 = new Length(23.01, Length.LengthUnit.INCHES);
		Length i2 = new Length(23.01, Length.LengthUnit.INCHES);
		System.out.print("Inches: ");
		
		if(i1.equals(i2)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
	
	public static void demonstrateFeetInchesEquality() {
		Length l1 = new Length(1.0,Length.LengthUnit.FEET);
		Length l2 = new Length(23.01,Length.LengthUnit.INCHES);
		System.out.print("Length: ");
		
		if(l1.equals(l2)) {
			System.out.println("Lengths are equal");
		}else {
			System.out.println("Lengths are not equal");
		}
	}
	
	public static boolean demonstrateLengthEquality(Length length1, Length length2) {
		return length1.equals(length2);
	}
	
	public static void main(String[] args) {
		
		demonstrateFeetEquality();
		demonstrateInchesEquality();
		demonstrateFeetInchesEquality();
		
	}

}