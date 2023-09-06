package aeroflot.dao;

import java.util.List;

import aeroflot.entity.Passenger;



public interface PassengerDAO {
	
	public List<Passenger> getPassenger();

	
	public Passenger findPassengerByLastName(String last_name);

	public void deletePassenger(int id_pax);
	
	public List<Passenger> getPassengerSortedByLastName();

}
