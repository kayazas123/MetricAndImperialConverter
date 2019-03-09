package com.mmi.assessment.unitconverter.unitconverter.api.enums;

public enum EnumConverterType {

    UNIT("UnitConverter"),
    TEMPERATURE("TemperatureConverter");

    EnumConverterType(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }
}
