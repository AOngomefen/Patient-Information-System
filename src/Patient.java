
public class Patient {

	private String fName, mName, lName, 
	street, city, state, zip, phone, 
	emergencyName, emergencyPhone;
	
	// constructor to initialize the patient information
	public Patient(String fName, String mName, String lName, String street, String city, String state, String zip,
			String phone, String emergencyName, String emergencyPhone) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
	}
	
	// setter methods for the patient information
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}
	
	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}
	
	// getter methods for the patient information
	
	public String getfName() {
		return fName;
	}
	
	public String getmName() {
		return mName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	// toString method to print the patient information
	
	public String toString() {
		return "Patient Name: " + fName + " " + mName + " " + lName + 
				"\nAddress: " + street + ", " + city + ", " + state + " " + zip + 
				"\nPhone: " + phone + 
				"\nEmergency Contact: " + emergencyName + 
				"\nEmergency Phone: " + emergencyPhone;
	}
	
}
