package com.nikhil.quantitymeasurement.app;

import com.nikhil.quantitymeasurement.controller.QuantityMeasurementController;
import com.nikhil.quantitymeasurement.model.QuantityDTO;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityMeasurementController controller = new QuantityMeasurementController();

        //Weight
        
        QuantityDTO weightInGrams = new QuantityDTO(1000.0, "GRAM", "WEIGHT");
        QuantityDTO weightInKilograms = new QuantityDTO(1.0, "KILOGRAM", "WEIGHT");

        //Equality
        System.out.println("Are weights equal: " + controller.compare(weightInGrams, weightInKilograms));

        //Conversion
        QuantityDTO convertedWeight = controller.convert(weightInGrams, new QuantityDTO(0, "KILOGRAM", "WEIGHT"));
        System.out.println(convertedWeight.getValue() + " " + convertedWeight.getUnit());
        System.out.println();

        //Volume
        
        QuantityDTO volumeInML = new QuantityDTO(1000.0, "MILLILITRE", "VOLUME");
        QuantityDTO volumeInL  = new QuantityDTO(1.0, "LITRE", "VOLUME");

        //Equality
        System.out.println("Are volumes equal: " + controller.compare(volumeInML, volumeInL));

        //Addition
        QuantityDTO addedVolume = controller.add(volumeInML, volumeInL);
        System.out.println(addedVolume.getValue() + " " + addedVolume.getUnit());
        System.out.println();

        //Temperature
        
        QuantityDTO celsius0     = new QuantityDTO(0.0,  "CELSIUS", "TEMPERATURE");
        QuantityDTO fahrenheit32 = new QuantityDTO(32.0, "FAHRENHEIT", "TEMPERATURE");

        //Equality
        System.out.println("0 C equals 32 F: " + controller.compare(celsius0, fahrenheit32));

        //Conversion
        QuantityDTO celsius100 = new QuantityDTO(100.0, "CELSIUS", "TEMPERATURE");
        QuantityDTO fahrenheit = controller.convert(celsius100, new QuantityDTO(0, "FAHRENHEIT", "TEMPERATURE"));
        System.out.println("100 C = " + fahrenheit.getValue() + " " + fahrenheit.getUnit());

        //Unsupported operation
        try {
            controller.add(celsius100, new QuantityDTO(50.0, "CELSIUS", "TEMPERATURE"));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}