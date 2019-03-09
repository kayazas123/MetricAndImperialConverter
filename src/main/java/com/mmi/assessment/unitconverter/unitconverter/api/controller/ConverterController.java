package com.mmi.assessment.unitconverter.unitconverter.api.controller;

import com.mmi.assessment.unitconverter.unitconverter.api.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private static final String CONTENT_TYPE = "application/json";
    private ConverterService converterService;


    @Autowired
    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @PostMapping(value = "/convert", consumes = CONTENT_TYPE, produces = CONTENT_TYPE)
    public ResponseEntity<ConverterResponseResource> convert(@RequestBody ConverterRequestResource requestResource){
        ConverterResponseResource responseResource = ConverterResponseResource.builder()
                                                        .result(converterService.convert(requestResource.getFromType(), requestResource.getToType(), Double.valueOf(requestResource.getValue())))
                                                        .build();
        return new ResponseEntity<>(responseResource, HttpStatus.OK);
    }
}
