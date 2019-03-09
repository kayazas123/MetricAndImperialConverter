package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumCentimeterToUnits {

    METRE(100),
    INCHES(2.54),
    FEET(30.48),
    MILES(160934.4),
    MILLIMETERS(10),
    KILOMETERS(100000);

    private double value;

    EnumCentimeterToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
