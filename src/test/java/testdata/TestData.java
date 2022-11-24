package testdata;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = "Male";
    public String number = faker.phoneNumber().subscriberNumber(10);
    public String birthDay = String.valueOf(faker.number().numberBetween(1, 30));
    public String birthMonth = "September";
    public String birthYear = String.valueOf(faker.number().numberBetween(1920, 2022));
    public String subject = "Computer Science";
    public String hobbies = "Music";
    public String upPicture = "img/hw_4.jpg";
    public String address = faker.address().fullAddress();
    public String state = "Haryana";
    public String city = "Panipat";

}