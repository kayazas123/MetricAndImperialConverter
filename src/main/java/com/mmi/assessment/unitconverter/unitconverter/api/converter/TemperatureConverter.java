package com.mmi.assessment.unitconverter.unitconverter.api.converter;


import com.mmi.assessment.unitconverter.unitconverter.api.enums.EnumConverterType;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class TemperatureConverter implements Converter {

    public static final String FAHRENHEIT = "\\b+(f|far|fahrenheit)\\b+";
    public static final String CELSIUS = "\\b+(c|cel|celsius)\\b+";

    @Override
    public String convert(String unitFrom, String unitTo, Double value) {
        double converted = 0.0;

        if(unitFrom.matches(FAHRENHEIT) && unitTo.matches(CELSIUS)) {
            //(50°F − 32) × 5/9
            converted = (value - 32.00) * 5 / 9;

        } else if(unitFrom.matches(CELSIUS) && unitTo.matches(FAHRENHEIT)) {
            //(50°C × 9/5) + 32 = 122°F
            converted = (value * 9 / 5) + 32;
        }

        return formatDecimalValue(converted);
    }

    private String formatDecimalValue(double converted) {
        return String.valueOf(new BigDecimal(converted).setScale(2, RoundingMode.CEILING));
    }

    @Override
    public String getType() {
        return EnumConverterType.TEMPERATURE.getType();
    }
}
