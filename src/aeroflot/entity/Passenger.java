package aeroflot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PAX")
	private int id_pax;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="birthday")
	private String birthday;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="member_bonus")
	private String member_bonus;
	
	@Column(name="fromCity")
	private String fromCity;
	
	@Column(name="toCity")
	private String toCity;
	
	@Column(name="departureDate")
	private String departureDate;
	
	public Passenger() {
		
	}

	public int getId_pax() {
		return id_pax;
	}

	public void setId_pax(int id_pax) {
		this.id_pax = id_pax;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMember_bonus() {
		return member_bonus;
	}

	public void setMember_bonus(String member_bonus) {
		this.member_bonus = member_bonus;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	@Override
	public String toString() {
		return "Passenger [id_pax=" + id_pax + ", first_name=" + first_name + ", last_name=" + last_name + ", birthday="
				+ birthday + ", email=" + email + ", gender=" + gender + ", member_bonus=" + member_bonus
				+ ", fromCity=" + fromCity + ", toCity=" + toCity + ", departureDate=" + departureDate + "]";
	}

	
	
}
