package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumInchesToUnits {

    METER(39.37),
    FEET(12),
    MILES(1.5783E-5),
    MILLIMETERS(25.4),
    CENTIMETERS(0.39370),
    KILOMETERS(2.54E-5);

    private double value;

    EnumInchesToUnits(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
