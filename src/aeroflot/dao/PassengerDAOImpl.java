package aeroflot.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aeroflot.entity.Passenger;


@Repository
public class PassengerDAOImpl implements PassengerDAO {
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<Passenger> getPassenger() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Passenger> theQuery = currentSession.createQuery("FROM Passenger", Passenger.class);
		List<Passenger> passenger = theQuery.getResultList();
		return passenger;

	}


	
	@Override
	public Passenger findPassengerByLastName(String last_name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Passenger> theQuery =  currentSession.createQuery("FROM Passenger where last_name=:last_name", Passenger.class);
		theQuery.setParameter("last_name", last_name);
		Passenger passenger = null;
		try {
			passenger = theQuery.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("DATA NOT FOUND");
		}
		return passenger;
	}
	
	@Override
	public void deletePassenger(int id_pax) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Passenger> theQuery =  currentSession.createQuery("delete Passenger where id_pax=:id_pax", Passenger.class);
		theQuery.setParameter("passenger", id_pax);
		theQuery.executeUpdate();	
	}
	
	@Override
	public List<Passenger> getPassengerSortedByLastName(){
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Passenger> theQuery = currentSession.createQuery("FROM Passenger order by last_name ASC", Passenger.class);
		
		List<Passenger> passenger = theQuery.getResultList();
		
		return passenger;
	}
}
