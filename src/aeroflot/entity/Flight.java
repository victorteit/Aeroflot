package aeroflot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_flight")
	private int id_flight;
	@Column(name="fromCity")
	private String fromCity;
	@Column(name="departureDate")
	private String departureDate;
	@Column(name="toCity")
	private String toCity;
	
	public Flight() {
		
	}

	public int getId_flight() {
		return id_flight;
	}

	public void setId_flight(int id_flight) {
		this.id_flight = id_flight;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Override
	public String toString() {
		return "Flight [id_flight=" + id_flight + ", fromCity=" + fromCity + ", departureDate=" + departureDate
				+ ", toCity=" + toCity + "]";
	}
	
	
	
	
	
	
}
