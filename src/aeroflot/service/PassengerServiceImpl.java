package aeroflot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aeroflot.dao.PassengerDAO;
import aeroflot.entity.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerDAO passengerDAO;
	
	@Override
	@Transactional
	public List<Passenger> getPassenger() {
		// 2- Delegate the call to customerDAO
		return passengerDAO.getPassenger();
	}
	
	@Override
	@Transactional
	public Passenger findPassengerByLastName(String last_name) {
		return passengerDAO.findPassengerByLastName(last_name);
	}
	
	@Override
	@Transactional
	public void deletePassenger(int id_pax) {
		
		passengerDAO.deletePassenger(id_pax);
	}
	
	@Override
	@Transactional
	public List<Passenger> getPassengerSortedByLastName() {
		// 2- Delegate the call to customerDAO
		return passengerDAO.getPassenger();
	}

}
