package pages;

import pages.components.CalendarComponents;
import pages.components.RegistrationResult;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    RegistrationResult registrationResult = new RegistrationResult();
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setNumber(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }


    public RegistrationPage setHobbies(String value) {
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        $("#city").click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage clickSubmit() {
        $("#submit").click();

        return this;
    }

    public RegistrationPage verifyModalResAppears() {
        registrationResult.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResContent(String key, String value) {
        registrationResult.verifyContent(key, value);

        return this;
    }
}
