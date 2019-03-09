package com.mmi.assessment.unitconverter.unitconverter.api.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ConverterFactory {

    @Autowired
    private List<Converter> unitConverter;

    private static final Map<String, Converter> converterCache = new HashMap<>();

    @PostConstruct
    public void initMyServiceCache() {
        for(Converter service : unitConverter) {
            converterCache.put(service.getType(), service);
        }
    }

    public static Converter getService(String type) {
        Converter service = converterCache.get(type);
        if(service == null) throw new RuntimeException("Unknown service type: " + type);
        return service;
    }

}
