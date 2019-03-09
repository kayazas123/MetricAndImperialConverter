package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumMilesToUnits {

    METRE(1609.344),
    INCHES(63360),
    FEET(5280),
    MILLIMETERS(1609339.99997549),
    CENTIMETERS(160934.4),
    KILOMETERS(1.6093399999754900431);

    private double value;


    EnumMilesToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
