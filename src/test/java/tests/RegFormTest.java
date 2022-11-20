package tests;

import org.junit.jupiter.api.Test;

public class RegFormTest extends TestBase{
    @Test
    void fillFormTest() {
        String  firstName = "Alexey",
                lastName = "Nikiforov",
                email = "some@mail.com",
                gender = "Male",
                number = "1231231234",
                birthDay = "04",
                birthMonth = "September",
                birthYear = "1993",
                subject = "Computer Science",
                hobbies = "Music",
                upPicture = "img/hw_4.jpg",
                address = "Russia, Moscow",
                state = "Haryana",
                city = "Panipat";


        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubject(subject)
                .setHobbies(hobbies)
                .setPicture(upPicture)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        registrationPage.verifyModalResAppears()
                    .verifyResContent("Student Name", firstName + " " + lastName)
                    .verifyResContent("Student Email", email)
                    .verifyResContent("Gender", gender)
                    .verifyResContent("Mobile", number)
                    .verifyResContent("Date of Birth", birthDay + " " + birthMonth + "," + birthYear)
                    .verifyResContent("Subjects", subject)
                    .verifyResContent("Picture", upPicture.substring(4))
                    .verifyResContent("Address", address)
                    .verifyResContent("State and City", state + " " + city);
    }
}