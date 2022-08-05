public class Person {
	
	//Attributes
	private String role;
	private String person_name;
	private String person_surname;
	private String telephone;
	private String e_mail;
	private String address;
	
	//Constructors
	public Person(String role, String person_name, String person_surname, String telephone, String e_mail, String address)
	{
	this.role = role;
	this.person_name = person_name; 
	this.person_surname = person_surname;
	this.telephone = telephone;
	this.e_mail = e_mail;
	this.address = address;
	}

	//Getters
	public String getRole() {
		return role; 	}
	
	public String getPersonName() {
		return person_name;		}
	
	public String getPersonSurname() {
		return person_surname;		}
	
	public String getTel() {
		return telephone;		}
	
	public String getEmail() {
		return e_mail; 		}
	
	public String getAddress() { 
		return address;			}
	
	//Setters
	public void PersonName(String newPersonName) {
		person_name = newPersonName; 		}
	
	public void setTel(String newTel) {
		telephone = newTel;		}
	
	public void setEmail(String newEmail) {
		role = newEmail; 		}
	
	public void setAddress(String newAddress) {
		role = newAddress;		  }
	
	//Methods
	public String to_string() {
		String objectString  = "\nRole: contractor" + 
				"\nName:  " + person_name +
				"\nTelehone:  " + telephone +
				"\nE-Mail:  " + e_mail +
				"\nAddress:  " + address;
		return objectString; }
	
	
}



