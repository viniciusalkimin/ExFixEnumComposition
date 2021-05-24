package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String name;
	public String email;
	public Date birthDay;

	public Client() {

	}

	public Client(String name, String email, Date birthDay) {
		this.name = name;
		this.email = email;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getbirthDay() {
		return birthDay;
	}

	public void setbirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDay) + ") - " + email;
 	}
}
