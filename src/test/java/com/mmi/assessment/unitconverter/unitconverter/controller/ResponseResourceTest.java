package com.mmi.assessment.unitconverter.unitconverter.controller;


import com.mmi.assessment.unitconverter.unitconverter.api.controller.ConverterResponseResource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.containsString;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ResponseResourceTest {


    @Test
    public void testResponseResource() {
        ConverterResponseResource converterResponseResource = ConverterResponseResource.builder()
                .result("Success")
                .build();
        Assert.assertThat(converterResponseResource.getResult(), containsString("Success"));

        converterResponseResource.setResult("SuccessAgain");

        Assert.assertThat(converterResponseResource.getResult(), containsString("SuccessAgain"));
    }
}
