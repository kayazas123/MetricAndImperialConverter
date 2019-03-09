package com.mmi.assessment.unitconverter.unitconverter.api.service;

import com.mmi.assessment.unitconverter.unitconverter.api.converter.Converter;
import com.mmi.assessment.unitconverter.unitconverter.api.converter.ConverterFactory;
import com.mmi.assessment.unitconverter.unitconverter.api.enums.EnumConverterType;

import com.mmi.assessment.unitconverter.unitconverter.api.exception.ConverterNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ConverterServiceImpl implements ConverterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConverterServiceImpl.class);

    private static final String VALID_UNIT_CONVERTION_TYPE = "\\b+(in|inch|inches|ft|feet|foot|mm|millimetre|millimetres|" +
            "mile|miles|mi|cm|centimetre|centimetres|metre|metres|m|mtr|km|kms|kilometres|kilometre)\\b+";
    private static final String VALID_UNIT_TEMPERATURE_TYPE = "\\b+(fahrenheit|celsius|F|C|f|c)\\b+";
    private static final String MESSAGE = "Value converted from %s%s to %s%s";

    @Override
    public String convert(String fromType, String toType, double value)  {

        String convertedValue = getConverterType(fromType, toType).convert(fromType, toType, value);
        LOGGER.info(String.format(MESSAGE, value, fromType, convertedValue, toType));
        return String.format(MESSAGE, value, fromType, convertedValue, toType);

    }


    private Converter getConverterType(final String fromType , final String toType) throws ConverterNotFoundException {

        boolean isValidFromType = isValidTypes(fromType);
        boolean isValidToType = isValidTypes(toType);

        if (isValidFromType && isValidToType) {
            if (isValidUnitTypes(toType)) {
                return ConverterFactory.getService(EnumConverterType.UNIT.getType());
            } else if(isValidTemperatureTypes(toType)) {
                return ConverterFactory.getService(EnumConverterType.TEMPERATURE.getType());
            }
        } else {
            throw new ConverterNotFoundException(String.format("Converter types %s or %s not found", fromType, toType));
        }

        return null;
    }


    private boolean isValidTypes(final String type) {
        return type.matches(VALID_UNIT_CONVERTION_TYPE) || type.matches(VALID_UNIT_TEMPERATURE_TYPE);
    }

    private boolean isValidUnitTypes(final String type) {
        return type.matches(VALID_UNIT_CONVERTION_TYPE);
    }

    private boolean isValidTemperatureTypes(final String type) {
        return type.matches(VALID_UNIT_TEMPERATURE_TYPE);
    }

}
