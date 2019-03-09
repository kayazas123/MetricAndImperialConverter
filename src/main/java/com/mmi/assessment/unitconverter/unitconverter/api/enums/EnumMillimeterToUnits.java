package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumMillimeterToUnits {

    METRE(1000),
    INCHES(25.4),
    FEET(304.8),
    MILES(1.609e+6),
    CENTIMETERS(10),
    KILOMETERS(1e+6);

    private double value;


    EnumMillimeterToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
