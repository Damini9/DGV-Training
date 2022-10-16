package programs;

public class Address {
	private String city;
	private String state;
	private int Pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		this.Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", Pincode=" + Pincode + "]";
	}
	

}
