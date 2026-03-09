package com.nikhil.quantitymeasurement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nikhil.quantitymeasurement.Length.LengthUnit;

class QuantityMeasurementAppTest {

	//FeetEquality
	
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
	
	//InchEquality
	
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
	
	//GenericLength
	
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
	
	//YardEquality
	
	@Test
	void testYardInchesComparision_DifferentValue() {
		Length yards = new Length(1.0,Length.LengthUnit.YARDS);
		Length inches = new Length(36.0, Length.LengthUnit.INCHES);
		assertTrue(yards.equals(inches));
	}
	
	@Test
	void testYardFeetComparision_DifferentValue() {
		Length yards = new Length(1.0, Length.LengthUnit.YARDS);
		Length feet = new Length(3.0, Length.LengthUnit.FEET);
		assertTrue(yards.equals(feet));
	}
	@Test
	void testCmInchesComparision_DifferentValue() {
		Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
		Length inches = new Length(0.393701, Length.LengthUnit.INCHES);
		assertTrue(cm.equals(inches));
	}
	
	@Test
	void testCmFeetComparision_DifferentValue() {
		Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
		Length feet = new Length(1.0, Length.LengthUnit.FEET);
		assertFalse(cm.equals(feet));
	}

	@Test
	void testFeetAndInchesEquality_SameLength() {
		Length feet = new Length(1.0, Length.LengthUnit.FEET);
		Length inches = new Length(12.0, Length.LengthUnit.INCHES);
		
		assertTrue(feet.equals(inches));
	}
	    
	@Test
	void testYardAndInchesEquality_SameLength() {
		Length yard = new Length(1.0, Length.LengthUnit.YARDS);
	    Length inches = new Length(36.0, Length.LengthUnit.INCHES);

        assertTrue(yard.equals(inches));
    }
	    
    @Test
    void testCentimeterAndInchesEquality_SameLength() {
        Length cm = new Length(100.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(39.3701, Length.LengthUnit.INCHES);

        assertTrue(cm.equals(inches));
    }
	    
    @Test
    void testFeetAndYardEquality_SameLength() {
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);

        assertTrue(feet.equals(yard));
    }
	    
    @Test
    void testCentimeterAndFeetEquality_SameLength() {
        Length cm = new Length(30.48, Length.LengthUnit.CENTIMETERS);
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        
        assertTrue(cm.equals(feet));
    }

    @Test
    void testFeetAndInchesEquality_DifferentLength() {
        Length feet = new Length(2.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        assertFalse(feet.equals(inches));
    }
	    
    @Test
    void testYardAndInchesEquality_DifferentLength() {
        Length yard = new Length(2.0, Length.LengthUnit.YARDS);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);

        assertFalse(yard.equals(inches));
    }
	    
    @Test
    void testCentimeterAndInchesEquality_DifferentLength() {
        Length cm = new Length(1000.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(39.3701, Length.LengthUnit.INCHES);

        assertFalse(cm.equals(inches));
    }
	    
    @Test
    void testFeetAndYardEquality_DifferentLength() {
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length yard = new Length(3.0, Length.LengthUnit.YARDS);

        assertFalse(feet.equals(yard));
    }
	    
    @Test
    void testCentimeterAndFeetEquality_DifferentLength() {
        Length cm = new Length(30.48, Length.LengthUnit.CENTIMETERS);
        Length feet = new Length(2.0, Length.LengthUnit.FEET);

        assertFalse(cm.equals(feet));
    }
    
    //UnitConversion
    
    @Test
    public void convertFeetToInches() {
    	Length lengthInInches = new Length(QuantityMeasurementApp.convert(3.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES),Length.LengthUnit.INCHES);
    	Length expectedLength = new Length(36.0,Length.LengthUnit.INCHES);
    	
    	assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(lengthInInches,expectedLength));
    }
    
    @Test
    void convertYardsToInchesUsingOverloadedMethod() {
    	Length lengthInInches = new Length(QuantityMeasurementApp.convert(2.0,Length.LengthUnit.YARDS, Length.LengthUnit.INCHES),Length.LengthUnit.INCHES);
    	Length expectedLength = new Length(72.0,Length.LengthUnit.INCHES);
    	
    	assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(lengthInInches,expectedLength));
    }
    
    //UnitAddition
    
    @Test
    void testAddition_SameUnit_FeetPlusFeet(){
         Length ans = new Length(3.0, Length.LengthUnit.FEET);
         Length q1 = new Length(1.0, Length.LengthUnit.FEET);
         Length res = q1.add(new Length(2.0, Length.LengthUnit.FEET));
         assertEquals(ans, res);
    }

    @Test
    void testAddition_SameUnit_InchPlusInch(){
         Length ans = new Length(12.0, Length.LengthUnit.INCHES);
         Length q1 = new Length(6.0, Length.LengthUnit.INCHES);
         Length res = q1.add(new Length(6.0, Length.LengthUnit.INCHES));
         assertEquals(ans, res);
    }

     @Test
    void testAddition_SameUnit_InchPlusFeet(){
         Length ans = new Length(24.0, Length.LengthUnit.INCHES);
         Length q1 = new Length(12.0, Length.LengthUnit.INCHES);
         Length res = q1.add(new Length(1.0, Length.LengthUnit.FEET));
         assertEquals(ans, res);
    }

    @Test
    void testAddition_SameUnit_FeetPlusInch(){
         Length ans = new Length(2.0, Length.LengthUnit.FEET);
         Length q1 = new Length(1.0, Length.LengthUnit.FEET);
         Length res = q1.add(new Length(12.0, Length.LengthUnit.INCHES));
         assertEquals(ans, res);
    }
    
    //TargetUnitAddition
    
    @Test
    void testAddition_ExplicitTarget_Feet(){
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);
        Length res = l1.add(l2, LengthUnit.FEET);
        Length ans = new Length(2, LengthUnit.FEET);
        assertEquals(ans, res);
    }
    
    @Test
    void testAddition_ExplicitTarget_Inches() {
    	Length res = new Length(1.0, Length.LengthUnit.FEET).add(new Length(12.0, Length.LengthUnit.INCHES), Length.LengthUnit.INCHES);
    	Length ans = new Length(24.0, Length.LengthUnit.INCHES);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_Yards() {
    	Length res = new Length(1.0, Length.LengthUnit.FEET).add(new Length(12.0, Length.LengthUnit.INCHES), Length.LengthUnit.YARDS);
    	Length ans = new Length(0.6666666666666666, Length.LengthUnit.YARDS);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_Centimeters() {
    	Length res = new Length(1.0, Length.LengthUnit.INCHES).add(new Length(1.0, Length.LengthUnit.INCHES), Length.LengthUnit.CENTIMETERS);
    	Length ans = new Length(5.08, Length.LengthUnit.CENTIMETERS);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_SameAsSecondOperand() {
    	Length res = new Length(2.0, Length.LengthUnit.YARDS).add(new Length(3.0, Length.LengthUnit.FEET), Length.LengthUnit.FEET);
    	Length ans = new Length(9.0, Length.LengthUnit.FEET);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_Commutativity() {
    	Length res = new Length(1.0, Length.LengthUnit.FEET).add(new Length(12.0, Length.LengthUnit.INCHES), Length.LengthUnit.YARDS);
    	Length res2 = new Length(12.0, Length.LengthUnit.INCHES).add(new Length(1.0, Length.LengthUnit.FEET), Length.LengthUnit.YARDS);
    	
    	assertEquals(res, res2);
    }
    
    @Test
    void testAddition_ExplicitTarget_WithZero() {
    	Length res = new Length(5.0, Length.LengthUnit.FEET).add(new Length(0.0, Length.LengthUnit.INCHES), Length.LengthUnit.YARDS);
    	Length ans = new Length(1.6666666666666666, Length.LengthUnit.YARDS);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_NegativeValues() {
    	assertThrows(IllegalArgumentException.class, () -> new Length(5.0, Length.LengthUnit.FEET).add(new Length(-2.0, Length.LengthUnit.FEET), Length.LengthUnit.INCHES));
    }
    
    @Test
    void testAddition_ExplicitTarget_NullTargetUnit() {
    	assertThrows(IllegalArgumentException.class, () -> new Length(5.0, Length.LengthUnit.FEET).add(new Length(-2.0, Length.LengthUnit.FEET), null));
    }
    
    @Test
    void testAddition_ExplicitTarget_LargeToSmallScale() {
    	Length res = new Length(1000.0, Length.LengthUnit.FEET).add(new Length(500.0, Length.LengthUnit.FEET), Length.LengthUnit.INCHES);
    	Length ans = new Length(18000.0, Length.LengthUnit.INCHES);
    	
    	assertEquals(res, ans);
    }
    
    @Test
    void testAddition_ExplicitTarget_SmallToLargeScale() {
    	Length res = new Length(12.0, Length.LengthUnit.INCHES).add(new Length(12.0, Length.LengthUnit.INCHES), Length.LengthUnit.YARDS);
    	Length ans = new Length(0.6666666666666666, Length.LengthUnit.YARDS);
    	
    	assertEquals(res, ans);
    }
    
}