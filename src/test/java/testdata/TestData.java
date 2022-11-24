package testdata;

import com.github.javafaker.Faker;

import java.util.Random;

public class TestData {
    Faker faker = new Faker();
    Random random = new Random();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = randomGender();
    public String number = faker.phoneNumber().subscriberNumber(10);
    public String birthDay = String.valueOf(faker.number().numberBetween(1, 30));
    public String birthMonth = randomMonth();
    public String birthYear = String.valueOf(faker.number().numberBetween(1920, 2022));
    public String subject = "Computer Science";
    public String hobbies = randomHobbies();
    public String upPicture = "img/hw_4.jpg";
    public String address = faker.address().fullAddress();
    public String state = "Haryana";
    public String city = "Panipat";

    public String randomGender() {
        String[] arrayGender = {"Male", "Female", "Other"};
        return arrayGender[random.nextInt(arrayGender.length)];
    }

    public String randomHobbies() {
        String[] arrayHobbies = {"Sports", "Reading", "Music"};
        return arrayHobbies[random.nextInt(arrayHobbies.length)];
    }

    public String randomMonth() {
        String[] arrayMonth = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        return arrayMonth[random.nextInt(arrayMonth.length)];
    }
}
