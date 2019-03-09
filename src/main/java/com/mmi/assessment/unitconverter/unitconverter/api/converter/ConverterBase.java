package com.mmi.assessment.unitconverter.unitconverter.api.converter;

import com.mmi.assessment.unitconverter.unitconverter.api.enums.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConverterBase {

    public static final String INCHES_CODES = "\\b+(in|inch|inches)\\b+";
    public static final String FEET_CODES = "\\b+(ft|feet|foot)\\b+";
    public static final String MILES_CODES = "\\b+(mi|mile|miles)\\b+";
    public static final String MILLIMETRE_CODES = "\\b+(mm|millimetre|millimetres)\\b+";
    public static final String CENTIMETRE_CODES = "\\b+(cm|centimetre|centimetres)\\b+";
    public static final String KILOMETRE_CODES = "\\b+(km|kms|kilometres|kilometre)\\b+";
    public static final String METER_CODES = "\\b+(m|mtr|metre|metres)\\b+";



    protected String convertFromKilometerToUnits(String unitTo, Double value) {
        double converted = 0.0;
        if (unitTo.matches(METER_CODES)) {
            converted = (value * EnumKilometerToUnits.METRE.getValue());
        }else if (unitTo.matches(INCHES_CODES)) {
            converted = (value * EnumKilometerToUnits.INCHES.getValue());
        } else if (unitTo.matches(FEET_CODES)) {
            converted = (value * EnumKilometerToUnits.FEET.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value / EnumKilometerToUnits.MILES.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value * EnumKilometerToUnits.MILLIMETERS.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value * EnumKilometerToUnits.CENTIMETER.getValue());
        }

        return formatDecimalValue(converted);
    }

    protected String convertFromCentimeterToUnits(String unitTo, Double value) {
        double converted = 0.0;
        if (unitTo.matches(INCHES_CODES)) {
            converted = (value / EnumCentimeterToUnits.INCHES.getValue());
        }else if (unitTo.matches(METER_CODES)) {
            converted = (value / EnumCentimeterToUnits.METRE.getValue());
        }else if (unitTo.matches(FEET_CODES)) {
            converted = (value / EnumCentimeterToUnits.FEET.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value / EnumCentimeterToUnits.MILES.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value * EnumCentimeterToUnits.MILLIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value / EnumCentimeterToUnits.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);
    }

    protected String convertFromMillimeterToUnits(String unitTo, Double value) {
        double converted = 0.0;
        if (unitTo.matches(METER_CODES)) {
            converted = (value / EnumMillimeterToUnits.METRE.getValue());
        }else if (unitTo.matches(INCHES_CODES)) {
            converted = (value / EnumMillimeterToUnits.INCHES.getValue());
        } else if (unitTo.matches(FEET_CODES)) {
            converted = (value / EnumMillimeterToUnits.FEET.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value / EnumMillimeterToUnits.MILES.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value / EnumMillimeterToUnits.CENTIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value / EnumMillimeterToUnits.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);
    }


    protected String convertFromMilesToUnits(String unitTo, Double value) {
        double converted = 0.0;
        if (unitTo.matches(METER_CODES)) {
            converted = (value * EnumMilesToUnits.METRE.getValue());
        }else if (unitTo.matches(INCHES_CODES)) {
            converted = (value * EnumMilesToUnits.INCHES.getValue());
        } else if (unitTo.matches(FEET_CODES)) {
            converted = (value * EnumMilesToUnits.FEET.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value * EnumMilesToUnits.MILLIMETERS.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value * EnumMilesToUnits.CENTIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value * EnumMilesToUnits.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);
    }

    protected String convertFromFeetToUnits(String unitTo, Double value) {
        double converted = 0.0;
        if (unitTo.matches(METER_CODES)) {
            converted = (value / EnumFeetToUnits.METRE.getValue());
        } if (unitTo.matches(INCHES_CODES)) {
            converted = (value * EnumFeetToUnits.INCHES.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value * EnumFeetToUnits.MILES.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value * EnumFeetToUnits.MILLIMETERS.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value * EnumFeetToUnits.CENTIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value / EnumFeetToUnits.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);
    }

    protected String convertFromInchesToUnits(String unitTo, Double value) {

        double converted = 0.0;
        if (unitTo.matches(METER_CODES)) {
            converted = (value / EnumInchesToUnits.METER.getValue());
        }else if (unitTo.matches(FEET_CODES)) {
            converted = (value / EnumInchesToUnits.FEET.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value / EnumInchesToUnits.MILES.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value * EnumInchesToUnits.MILLIMETERS.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value / EnumInchesToUnits.CENTIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value * EnumInchesToUnits.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);
    }


    private String formatDecimalValue(double converted) {
        return String.valueOf(new BigDecimal(converted).setScale(4, RoundingMode.CEILING));
    }


    protected String convertFromMetersToUnits(String unitTo, Double value){
        double converted = 0.0;
        if (unitTo.matches(INCHES_CODES)) {
            converted = (value / EnumUnitToMeter.INCHES.getValue());
        } else if (unitTo.matches(FEET_CODES)) {
            converted = (value / EnumUnitToMeter.FEET.getValue());
        } else if (unitTo.matches(MILES_CODES)) {
            converted = (value / EnumUnitToMeter.MILES.getValue());
        } else if (unitTo.matches(MILLIMETRE_CODES)) {
            converted = (value / EnumUnitToMeter.MILLIMETERS.getValue());
        } else if (unitTo.matches(CENTIMETRE_CODES)) {
            converted = (value / EnumUnitToMeter.CENTIMETERS.getValue());
        } else if (unitTo.matches(KILOMETRE_CODES)) {
            converted = (value / EnumUnitToMeter.KILOMETERS.getValue());
        }

        return formatDecimalValue(converted);

    }


    protected boolean isFromMetersToUnits(String from, String to) {
        return from.matches(METER_CODES) && (to.matches(INCHES_CODES) ||
                to.matches(FEET_CODES) ||
                to.matches(MILES_CODES) ||
                to.matches(MILLIMETRE_CODES) ||
                to.matches(CENTIMETRE_CODES) ||
                to.matches(KILOMETRE_CODES));
    }

    protected boolean isFromInchesToUnits(String from, String to) {
        return from.matches(INCHES_CODES) && (to.matches(MILES_CODES) ||
                to.matches(FEET_CODES) ||
                to.matches(MILES_CODES) ||
                to.matches(MILLIMETRE_CODES) ||
                to.matches(CENTIMETRE_CODES) ||
                to.matches(KILOMETRE_CODES) ||
                to.matches(METER_CODES));
    }

    protected boolean isFromFeetToUnits(String from, String to) {
        return from.matches(FEET_CODES) && (to.matches(METER_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(MILES_CODES) ||
                to.matches(MILLIMETRE_CODES) ||
                to.matches(CENTIMETRE_CODES) ||
                to.matches(KILOMETRE_CODES));

    }

    protected boolean isFromKilometerToUnits(String from, String to) {
        return from.matches(KILOMETRE_CODES) && (to.matches(MILES_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(FEET_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(METER_CODES) ||
                to.matches(MILLIMETRE_CODES) ||
                to.matches(CENTIMETRE_CODES));
    }

    protected boolean isFromCentimeterToUnits(String from, String to) {
        return from.matches(CENTIMETRE_CODES) && (to.matches(MILES_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(FEET_CODES) ||
                to.matches(MILLIMETRE_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(METER_CODES) ||
                to.matches(KILOMETRE_CODES));
    }

    protected boolean isFromMilesToUnits(String from, String to) {

        return from.matches(MILES_CODES) && (
                to.matches(INCHES_CODES) ||
                        to.matches(FEET_CODES) ||
                        to.matches(METER_CODES) ||
                        to.matches(MILLIMETRE_CODES) ||
                        to.matches(CENTIMETRE_CODES) ||
                        to.matches(KILOMETRE_CODES));
    }


    protected boolean isFromMillimeterToUnits(String from, String to) {

        return from.matches(MILLIMETRE_CODES) && (to.matches(MILES_CODES) ||
                to.matches(INCHES_CODES) ||
                to.matches(FEET_CODES) ||
                to.matches(METER_CODES) ||
                to.matches(CENTIMETRE_CODES) ||
                to.matches(KILOMETRE_CODES));
    }


}
