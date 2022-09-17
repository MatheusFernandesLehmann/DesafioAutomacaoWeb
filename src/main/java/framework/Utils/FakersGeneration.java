package framework.Utils;

import java.util.Locale;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class FakersGeneration {

	private Faker faker;

	private String firstName;

	private String lastName;

	private String address;

	private String email;

	private String university;

	private String profession;

	public FakersGeneration(WebDriver driver) {

		faker = new Faker(new Locale("pt-BR"));

	}

	public String getFirstName() {

		firstName = faker.name().firstName();

		return firstName;
	}

	public String getLastName() {

		lastName = faker.name().lastName();

		return lastName;
	}

	public String getEmail() {

		email = faker.internet().emailAddress();

		return email;

	}

	public String getAddress() {

		address = faker.address().city();

		return address;
	}

	public String getUniversity() {

		university = faker.university().name();

		return university;

	}

	public String getProfession() {

		profession = faker.company().profession();

		return profession;

	}

}
