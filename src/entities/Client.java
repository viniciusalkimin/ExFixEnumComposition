package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String name;
	public String email;
	public Date birthDate;

	public Client() {

	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
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

	public Date getbirthDate() {
		return birthDate;
	}

	public void setbirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}
}
