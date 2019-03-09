package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumKilometerToUnits {

    METRE(1000),
    INCHES(39370.079),
    FEET(3280.84),
    MILES(1.609),
    MILLIMETERS(1e+6),
    CENTIMETER(100000);

    private double value;

    EnumKilometerToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
