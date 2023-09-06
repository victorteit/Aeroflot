package aeroflot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_address")
	private int id_address;
	@Column(name="number")
	private String number;
	@Column(name="streetAddress")
	private String streetAddress;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="zipcode")
	private String zipcode;
	
	
	public Address() {
		
	}


	public int getId_address() {
		return id_address;
	}


	public void setId_address(int id_address) {
		this.id_address = id_address;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "Address [id_address=" + id_address + ", number=" + number + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
	
	
}
