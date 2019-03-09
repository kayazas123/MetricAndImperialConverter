package com.mmi.assessment.unitconverter.unitconverter.api.service;

import com.mmi.assessment.unitconverter.unitconverter.api.exception.ConverterNotFoundException;

public interface ConverterService {

    String convert(String fromType, String toValueType, double value);
}
