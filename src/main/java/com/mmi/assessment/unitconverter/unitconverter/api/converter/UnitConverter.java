package com.mmi.assessment.unitconverter.unitconverter.api.converter;


import com.mmi.assessment.unitconverter.unitconverter.api.enums.*;
import org.springframework.stereotype.Component;

@Component
public class UnitConverter extends ConverterBase implements Converter {



    @Override
    public String convert(String unitFrom, String unitTo, Double value) {

        if (isFromMetersToUnits(unitFrom, unitTo)) {
            return convertFromMetersToUnits(unitTo, value);
        } else if(isFromInchesToUnits(unitFrom, unitTo)) {
            return convertFromInchesToUnits(unitTo, value);
        } else if(isFromFeetToUnits(unitFrom, unitTo)) {
            return convertFromFeetToUnits(unitTo, value);
        } else if(isFromMilesToUnits(unitFrom, unitTo)) {
            return convertFromMilesToUnits(unitTo, value);
        } else if(isFromMillimeterToUnits(unitFrom, unitTo)) {
            return convertFromMillimeterToUnits(unitTo, value);
        } else if(isFromCentimeterToUnits(unitFrom, unitTo)) {
            return convertFromCentimeterToUnits(unitTo, value);
        } else if(isFromKilometerToUnits(unitFrom, unitTo)){
            return convertFromKilometerToUnits(unitTo, value);
        }

        return "";
    }


    @Override
    public String getType() {
        return EnumConverterType.UNIT.getType();
    }
}
