package aeroflot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aeroflot.entity.Passenger;
import aeroflot.service.PassengerService;


@Controller
@RequestMapping("/")
public class PaxController {
	
	@Autowired
//	private PassengerDAO passengerDAO;
	private PassengerService passengerService;
	
	
	@GetMapping("/")
	public String mainPage() {
		return "/index";
	}
	@GetMapping("/main")
	public String toMainPage() {
		return "/main";
	}
	
	@RequestMapping("/list-passengers")
	public String paxList(Model theModel) {
		
		List<Passenger> passenger = passengerService.getPassenger();
		
		theModel.addAttribute("passenger", passenger);
		
		return "/list-passengers";
	}
	
	@GetMapping("/passengers/find/{last_name}")
	public String getPassenger(@PathVariable String last_name, Model model) {
		System.out.println (last_name);
		Passenger passenger = passengerService.findPassengerByLastName(last_name);
		if (passenger==null) {
			System.out.println("DATA NOT FOUND");
		}
	model.addAttribute("passenger", passenger);
	return "findPassengerByLastName";
	}
	
	@GetMapping("/passengers/find/deleteByID/{1}")
	public String deletePassenger(@RequestParam("id_pax") int id_pax) {
		
		passengerService.deletePassenger(id_pax);
		
		return "/list-passenger";
	}
	
	@RequestMapping("/passenger/sorted")
	public String getPassengerSortedByLastName(Model model) {
		List<Passenger> passenger = passengerService.getPassengerSortedByLastName();
		model.addAttribute("passenger", passenger);
		
		return "getPassengerSortedByLastName";
	}
	
//	@GetMapping("/passengers/find/id/{id_pax}")
//	public String getPassengerById(@RequestParam("id_pax") int id_pax, Model model) {
//		model.addAttribute("passenger", passenger);
//		return "getPassengerById";
//	}
}
	
