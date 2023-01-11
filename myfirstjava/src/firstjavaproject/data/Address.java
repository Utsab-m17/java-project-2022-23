package firstjavaproject.data;

public class Address {
	private String city;
	private String country;
	private int houseNo;
	private String state;
	private String streetName;
	private int pinCode;
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", houseNo=" + houseNo + ", state=" + state
				+ ", streetName=" + streetName + ", pinCode=" + pinCode + "]";
	}
	
	
	public Address(String city, String country, int houseNo, String state, String streetName, int pinCode) {
		this.city = city;
		this.country = country;
		this.houseNo = houseNo;
		this.state = state;
		this.streetName = streetName;
		this.pinCode = pinCode;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
