package com.mmi.assessment.unitconverter.unitconverter.service;


import com.mmi.assessment.unitconverter.unitconverter.api.service.ConverterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConverterServiceTest {

    @Autowired
    private ConverterService converterService;

    @Test
    public void testConvertMetreToInch(){
        String convert = converterService.convert("metre", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 590.5512inch"));
    }

    @Test
    public void testConvertMetreToFoot(){
        String convert = converterService.convert("metre", "foot", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 49.2126foot"));
    }

    @Test
    public void testConvertMetreToMiles(){
        String convert = converterService.convert("metre", "miles", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 0.0094miles"));
    }

    @Test
    public void testConvertMetreToMillimetre(){
        String convert = converterService.convert("metre", "millimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 15000.0000millimetre"));
    }

    @Test
    public void testConvertInchesToFoot(){
        String convert = converterService.convert("inch", "foot", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertInchesToMiles(){
        String convert = converterService.convert("inch", "miles", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 950389.6598miles"));
    }

    @Test
    public void testConvertInchesToMillimetre(){
        String convert = converterService.convert("inch", "millimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertInchesToCentimetre(){
        String convert = converterService.convert("inch", "centimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertFootToKilometre(){
        String convert = converterService.convert("foot", "kilometre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 0.0046kilometre"));
    }

    @Test
    public void testConvertFootToMetre(){
        String convert = converterService.convert("foot", "metre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertInchesToInches(){
        String convert = converterService.convert("foot", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertFootToMiles(){
        String convert = converterService.convert("foot", "miles", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertFootToMillimetre(){
        String convert = converterService.convert("foot", "metre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }

    @Test
    public void testConvertFootToCentimetre(){
        String convert = converterService.convert("foot", "metre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 0.3811metre"));
    }




    @Test
    public void testConvertFahrenheitToCelsius(){
        String convert = converterService.convert("fahrenheit", "celsius", new Double(100));
        assertThat(convert, containsString("Value converted from 100.0fahrenheit to 37.78celsius"));

    }

    @Test
    public void testConvertCelsiusToFahrenheit(){
        String convert = converterService.convert("celsius", "fahrenheit", new Double(100));
        assertThat(convert, containsString("Value converted from 100.0celsius to 212.00fahrenheit"));

    }
}
