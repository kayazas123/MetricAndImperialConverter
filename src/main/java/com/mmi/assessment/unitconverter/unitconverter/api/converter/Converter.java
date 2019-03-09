package com.mmi.assessment.unitconverter.unitconverter.api.converter;

public interface Converter {
    String convert(String unit, String unitTo, Double value);
    String getType();
}
