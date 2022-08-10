package com.HospitalManagment.HospitalManagment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagment.HospitalManagment.Service.HospitalManagementService;
import com.HospitalManagment.HospitalManagment.enities.Patient;

@RestController
public class HospitalManagementController {
	
	@Autowired(required = true)
	private HospitalManagementService hospitalManagementService;

//	get the patient for through getmapping
	@GetMapping("/patient")
	public List<Patient> getPatients() {
		return this.hospitalManagementService.getPatients();
	} 
	
// add the patient details inside the list and get through in form of JSON
	@PostMapping("/createpatient")
	public Patient addPatients(@RequestBody Patient patient ) {
			
			return this.hospitalManagementService.addPatient(patient);
		
	}
	
//	get the pateints which have the status admitted or discharge
	@GetMapping("/patient/status/{status}")
	public List<Patient> getPatient(@PathVariable String status) {
		return this.hospitalManagementService.getPatients(status);
	}
}

