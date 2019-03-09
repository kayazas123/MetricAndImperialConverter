package com.mmi.assessment.unitconverter.unitconverter.service;


import com.mmi.assessment.unitconverter.unitconverter.api.converter.Converter;
import com.mmi.assessment.unitconverter.unitconverter.api.exception.ConverterNotFoundException;
import com.mmi.assessment.unitconverter.unitconverter.api.service.ConverterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConverterServiceTest {

    @Autowired
    private ConverterService converterService;

    @Autowired
    private Converter unitConverter;

    @Test
    public void testConvertMetreToInch(){
        String convert = converterService.convert("metre", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 590.5512inch"));
    }

    @Test
    public void testTestInvalidValues(){
        String convert = unitConverter.convert("metrerrr", "inchrrrr", new Double(15));
        assertThat(convert, containsString(""));
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
    public void testConvertMetreToCentimetre(){
        String convert = converterService.convert("metre", "centimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 1500.0000centimetre"));
    }

    @Test
    public void testConvertMetreToKilometre(){
        String convert = converterService.convert("metre", "kilometre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0metre to 0.0150kilometre"));
    }

    @Test
    public void testConvertInchesToFoot(){
        String convert = converterService.convert("inch", "foot", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 1.2500foot"));
    }

    @Test
    public void testConvertInchesToMetre(){
        String convert = converterService.convert("inch", "metre", new Double(150));
        assertThat(convert, containsString("Value converted from 150.0inch to 3.8101metre"));
    }

    @Test
    public void testConvertInchesToKilometre(){
        String convert = converterService.convert("inch", "kilometre", new Double(115));
        assertThat(convert, containsString("Value converted from 115.0inch to 0.0030kilometre"));
    }

    @Test
    public void testConvertInchesToMiles(){
        String convert = converterService.convert("inch", "miles", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 950389.6598miles"));
    }

    @Test
    public void testConvertInchesToMillimetre(){
        String convert = converterService.convert("inch", "millimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 381.0000millimetre"));
    }

    @Test
    public void testConvertInchesToCentimetre(){
        String convert = converterService.convert("inch", "centimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0inch to 38.1001centimetre"));
    }


    //Foot

    @Test
    public void testConvertFootToCentimetre(){
        String convert = converterService.convert("foot", "centimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 457.2000centimetre"));
    }

    @Test
    public void testConvertFootToKilometre(){
        String convert = converterService.convert("foot", "kilometre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 0.0046kilometre"));
    }

    @Test
    public void testConvertFootToMetre(){
        String convert = converterService.convert("foot", "metre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 4.5718metre"));
    }

    @Test
    public void testConvertFootToInches(){
        String convert = converterService.convert("foot", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 180.0000inch"));
    }

    @Test
    public void testConvertFootToMiles(){
        String convert = converterService.convert("foot", "miles", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 0.0029miles"));
    }

    @Test
    public void testConvertFootToMillimetre(){
        String convert = converterService.convert("foot", "millimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0foot to 4572.0000millimetre"));
    }

    @Test
    public void testConvertMilesToInch(){
        String convert = converterService.convert("miles", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 950400.0000inch"));
    }

    @Test
    public void testConvertMilesToMetre(){
        String convert = converterService.convert("miles", "metre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 24140.1600metre"));
    }

    @Test
    public void testConvertMilesToFoot(){
        String convert = converterService.convert("miles", "foot", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 79200.0000foot"));
    }

    @Test
    public void testConvertMilesToMillimetre(){
        String convert = converterService.convert("miles", "millimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 24140099.9997millimetre"));
    }

    @Test
    public void testConvertMilesToCentimetre(){
        String convert = converterService.convert("miles", "centimetre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 2414016.0000centimetre"));
    }

    @Test
    public void testConvertMilesToKilometre(){
        String convert = converterService.convert("miles", "kilometre", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0miles to 24.1401kilometre"));
    }


    //Millimetre tests

    @Test
    public void testConvertMillimetreToInch(){
        String convert = converterService.convert("millimetre", "inch", new Double(15));
        assertThat(convert, containsString("Value converted from 15.0millimetre to 0.5906inch"));
    }

    @Test
    public void testConvertMillimetreToMetre(){
        String convert = converterService.convert("millimetre", "metre", new Double(15007));
        assertThat(convert, containsString("Value converted from 15007.0millimetre to 15.0070metre"));
    }

    @Test
    public void testConvertMillimetreToFoot(){
        String convert = converterService.convert("millimetre", "foot", new Double(15767));
        assertThat(convert, containsString("Value converted from 15767.0millimetre to 51.7291foot"));
    }

    @Test
    public void testConvertMillimetreToMiles(){
        String convert = converterService.convert("millimetre", "miles", new Double(15654));
        assertThat(convert, containsString("Value converted from 15654.0millimetre to 0.0098miles"));
    }

    @Test
    public void testConvertMillimetreToCentimetre(){
        String convert = converterService.convert("millimetre", "centimetre", new Double(1543));
        assertThat(convert, containsString("Value converted from 1543.0millimetre to 154.3001centimetre"));
    }

    @Test
    public void testConvertMillimetreToKilometre(){
        String convert = converterService.convert("millimetre", "kilometre", new Double(1543));
        assertThat(convert, containsString("Value converted from 1543.0millimetre to 0.0016kilometre"));
    }

    //Centimetre

    @Test
    public void testConvertCentimetreToInch(){
        String convert = converterService.convert("centimetre", "inch", new Double(157767));
        assertThat(convert, containsString("Value converted from 157767.0centimetre to 62112.9922inch"));
    }

    @Test
    public void testConvertCentimetreToMetre(){
        String convert = converterService.convert("centimetre", "metre", new Double(15876));
        assertThat(convert, containsString("Value converted from 15876.0centimetre to 158.7600metre"));
    }

    @Test
    public void testConvertCentimetreToFoot(){
        String convert = converterService.convert("centimetre", "foot", new Double(1599));
        assertThat(convert, containsString("Value converted from 1599.0centimetre to 52.4607foot"));
    }

    @Test
    public void testConvertCentimetreToMiles(){
        String convert = converterService.convert("centimetre", "miles", new Double(1000));
        assertThat(convert, containsString("Value converted from 1000.0centimetre to 0.0063miles"));
    }

    @Test
    public void testConvertCentimetreToMillimetre(){
        String convert = converterService.convert("centimetre", "millimetre", new Double(150));
        assertThat(convert, containsString("Value converted from 150.0centimetre to 1500.0000millimetre"));
    }

    @Test
    public void testConvertCentimetreToKilometre(){
        String convert = converterService.convert("centimetre", "kilometre", new Double(1500000));
        assertThat(convert, containsString("Value converted from 1500000.0centimetre to 15.0000kilometre"));
    }


    //Kilometre

    @Test
    public void testConvertKilometreToInch(){
        String convert = converterService.convert("kilometre", "inch", new Double(2000));
        assertThat(convert, containsString("Value converted from 2000.0kilometre to 78740158.0000inch"));
    }

    @Test
    public void testConvertKilometreToMetre(){
        String convert = converterService.convert("kilometre", "metre", new Double(20));
        assertThat(convert, containsString("Value converted from 20.0kilometre to 20000.0000metre"));
    }

    @Test
    public void testConvertKilometreToFoot(){
        String convert = converterService.convert("kilometre", "foot", new Double(10));
        assertThat(convert, containsString("Value converted from 10.0kilometre to 32808.4001foot"));
    }

    @Test
    public void testConvertKilometreToMiles(){
        String convert = converterService.convert("kilometre", "miles", new Double(160));
        assertThat(convert, containsString("Value converted from 160.0kilometre to 99.4407miles"));
    }

    @Test
    public void testConvertKilometreToMillimetre(){
        String convert = converterService.convert("kilometre", "millimetre", new Double(1));
        assertThat(convert, containsString("Value converted from 1.0kilometre to 1000000.0000millimetre"));
    }

    @Test
    public void testConvertKilometreToCentimetre(){
        String convert = converterService.convert("kilometre", "centimetre", new Double(1));
        assertThat(convert, containsString("Value converted from 1.0kilometre to 100000.0000centimetre"));
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

    @Test(expected = ConverterNotFoundException.class)
    public void testConverterNotFoundException() {
        converterService.convert("celsiusss", "fahrenheit", new Double(100));
    }

}
