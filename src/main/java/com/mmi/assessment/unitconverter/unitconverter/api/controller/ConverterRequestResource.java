package com.mmi.assessment.unitconverter.unitconverter.api.controller;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConverterRequestResource {

    private String fromType;
    private String toType;
    private String value;
}
