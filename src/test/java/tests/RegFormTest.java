package tests;

import org.junit.jupiter.api.Test;

public class RegFormTest extends TestBase{

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .setFirstName(testdata.firstName)
                .setLastName(testdata.lastName)
                .setEmail(testdata.email)
                .setGender(testdata.gender)
                .setNumber(testdata.number)
                .setBirthDate(testdata.birthDay, testdata.birthMonth, testdata.birthYear)
                .setSubject(testdata.subject)
                .setHobbies(testdata.hobbies)
                .setPicture(testdata.upPicture)
                .setAddress(testdata.address)
                .setState(testdata.state)
                .setCity(testdata.city)
                .clickSubmit();

        registrationPage.verifyModalResAppears()
                    .verifyResContent("Student Name", testdata.firstName + " " + testdata.lastName)
                    .verifyResContent("Student Email", testdata.email)
                    .verifyResContent("Gender", testdata.gender)
                    .verifyResContent("Mobile", testdata.number)
                    .verifyResContent("Date of Birth", testdata.birthDay + " " + testdata.birthMonth + "," + testdata.birthYear)
                    .verifyResContent("Subjects", testdata.subject)
                    .verifyResContent("Picture", testdata.upPicture.substring(4))
                    .verifyResContent("Address", testdata.address)
                    .verifyResContent("State and City", testdata.state + " " + testdata.city);
    }
}