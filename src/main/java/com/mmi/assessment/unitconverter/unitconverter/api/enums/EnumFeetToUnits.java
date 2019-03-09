package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumFeetToUnits {

    METRE(3.281),
    INCHES(12),
    MILES(0.00018939),
    MILLIMETERS(304.8),
    CENTIMETERS(30.48),
    KILOMETERS(3280.84);

    private double value;

    EnumFeetToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
