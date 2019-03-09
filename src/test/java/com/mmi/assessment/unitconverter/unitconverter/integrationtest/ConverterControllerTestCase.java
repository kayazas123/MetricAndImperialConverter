package com.mmi.assessment.unitconverter.unitconverter.integrationtest;


import com.mmi.assessment.unitconverter.unitconverter.api.controller.ConverterRequestResource;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class ConverterControllerTestCase {

    public ConverterControllerTestCase() {
    }

    @Test
    public void contextLoads() {
    }

    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    public void successfullyConvertMetersToInches() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("metre");
        requestResource.setToType("inch");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 15.0metre to 590.5512inch"));

    }

    @Test
    public void failToConvertMetersToInchesForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("metreeer");
        requestResource.setToType("inch");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types metreeer or inch not found"));

    }


    @Test
    public void failToConvertMetersToInchesForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("metre");
        requestResource.setToType("inchhhhh");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types metre or inchhhhh not found"));

    }




    @Test
    public void canSuccessfullyConvertInchesToMetre() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("inch");
        requestResource.setToType("metre");
        requestResource.setValue("16");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 16.0inch to 0.4065metre"));

    }

    @Test
    public void failToConvertInchesToMetreForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("inzhes");
        requestResource.setToType("inch");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types inzhes or inch not found"));

    }


    @Test
    public void failToConvertInchesToMetreForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("inch");
        requestResource.setToType("mmetree");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types inch or mmetree not found"));

    }


    @Test
    public void canSuccessfullyConvertFootToCentimetre() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("feet");
        requestResource.setToType("cm");
        requestResource.setValue("16");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 16.0feet to 487.6801cm"));

    }


    @Test
    public void failToConvertFootToCentimetreForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("fet");
        requestResource.setToType("mm");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types fet or mm not found"));

    }


    @Test
    public void failToConvertConvertFootToCentimetreForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("inch");
        requestResource.setToType("mmetree");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types inch or mmetree not found"));

    }

    @Test
    public void canSuccessfullyConvertMilesToKilometre() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("miles");
        requestResource.setToType("kilometre");
        requestResource.setValue("100");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 100.0miles to 160.9340kilometre"));

    }

    @Test
    public void failToConvertMilesToKilometreForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("miles");
        requestResource.setToType("kilmetres");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types miles or kilmetres not found"));

    }


    @Test
    public void failToConvertMilesToKilometreForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("inch");
        requestResource.setToType("mmetree");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types inch or mmetree not found"));

    }


    @Test
    public void canSuccessfullyConvertMillimetreToCentimetre() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("mm");
        requestResource.setToType("cm");
        requestResource.setValue("100");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 100.0mm to 10.0000cm"));

    }

    @Test
    public void failToConvertMillimetreToCentimetreForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("mmmm");
        requestResource.setToType("cm");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types mmmm or cm not found"));

    }


    @Test
    public void failToConvertMillimetreToCentimetreForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("mm");
        requestResource.setToType("cmmmz");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types mm or cmmmz not found"));

    }


    @Test
    public void canSuccessfullyConvertCentimetreToMillimetre() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("cm");
        requestResource.setToType("mm");
        requestResource.setValue("1000");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 1000.0cm to 10000.0000mm"));

    }

    @Test
    public void failToConvertCentimetreToMillimetreForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("cmm");
        requestResource.setToType("mm");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types cmm or mm not found"));

    }


    @Test
    public void failToConvertCentimetreToMillimetreForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("cm");
        requestResource.setToType("mmz");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types cm or mmz not found"));

    }

    @Test
    public void canSuccessfullyConvertKilometreToMiles() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("km");
        requestResource.setToType("miles");
        requestResource.setValue("100");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 100.0km to 62.1505miles"));

    }


    @Test
    public void failToConvertKilometreToMilesForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("kmz");
        requestResource.setToType("miles");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types kmz or miles not found"));

    }


    @Test
    public void failToConvertKilometreToMilesForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("km");
        requestResource.setToType("males");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types km or males not found"));

    }

    @Test
    public void canSuccessfullyConvertFarenheitToCelcius() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("fahrenheit");
        requestResource.setToType("celsius");
        requestResource.setValue("100");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("result", equalTo("Value converted from 100.0fahrenheit to 37.78celsius"));

    }


    @Test
    public void failToConvertFarenheitToCelciusForInvalidFromType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("fahrenheitt");
        requestResource.setToType("celsius");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types fahrenheitt or celsius not found"));

    }


    @Test
    public void failToConvertFarenheitToCelciusForInvalidToType() {

        ConverterRequestResource requestResource = new ConverterRequestResource();
        requestResource.setFromType("fahrenheit");
        requestResource.setToType("celsiuss");
        requestResource.setValue("15");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestResource)
                .post("/convert")
                .then()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .body("errors[0]",equalTo("Converter types fahrenheit or celsiuss not found"));

    }


}
