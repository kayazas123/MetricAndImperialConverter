package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumUnitToMeter {

    INCHES(0.0254),
    FEET(0.3048),
    MILES(1609.35),
    MILLIMETERS(0.001),
    CENTIMETERS(0.01),
    KILOMETERS(1000);

    private double value;

    EnumUnitToMeter(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
