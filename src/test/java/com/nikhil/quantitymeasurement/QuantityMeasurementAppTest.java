package com.nikhil.quantitymeasurement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuantityMeasurementAppTest {

	@Test
	void testFeetEquality_SameValue() {
		Length f1 = new Length(11.02, Length.LengthUnit.FEET);
		Length f2 = new Length(11.02, Length.LengthUnit.FEET);
		assertTrue(f1.equals(f2));
	}
	
	@Test
	void testFeetEquality_DifferentValue() {
		Length f1 = new Length(1.0, Length.LengthUnit.FEET);
		Length f2 = new Length(2.0, Length.LengthUnit.FEET);
		assertFalse(f1.equals(f2));
	}
	
	@Test
	void testFeetEquality_NullComparison() {
		Length f1 = new Length(1.0, Length.LengthUnit.FEET);
		assertFalse(f1.equals(null));
	}
	
	@Test
	void testFeetEquality_NonNumericInput() {
		Length f1 = new Length(1.0, Length.LengthUnit.FEET);
		assertFalse(f1.equals("1.0"));
	}
	@Test
	void testFeetEquality_SameReference() {
		Length f1 = new Length(1.0, Length.LengthUnit.FEET);
		assertTrue(f1.equals(f1));
	}
	@Test
	void testInchesEquality_SameValue() {
		Length i1 = new Length(11.02, Length.LengthUnit.INCHES);
		Length i2 = new Length(11.02, Length.LengthUnit.INCHES);
		assertTrue(i1.equals(i2));
	}
	
	@Test
	void testInchesEquality_DifferentValue() {
		Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
		Length i2 = new Length(2.0, Length.LengthUnit.INCHES);
		assertFalse(i1.equals(i2));
	}
	
	@Test
	void testInchesEquality_NullComparison() {
		Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
		assertFalse(i1.equals(null));
	}
	
	@Test
	void testInchesEquality_NonNumericInput() {
		Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
		assertFalse(i1.equals("1.0"));
	}
	@Test
	void testInchesEquality_SameReference() {
		Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
		assertTrue(i1.equals(i1));
	}
	
	@Test
	void testFeetInchesComparison() {
		Length feet = new Length(1.0, Length.LengthUnit.FEET);
		Length inches = new Length(12.0, Length.LengthUnit.INCHES);
		assertTrue(feet.equals(inches));
	}
	
	@Test
	void testFeetInchesComparision_DifferentValue() {
		Length feet = new Length(2.0,Length.LengthUnit.FEET);
		Length inches = new Length(12.0, Length.LengthUnit.INCHES);
		assertFalse(feet.equals(inches));
	}

}