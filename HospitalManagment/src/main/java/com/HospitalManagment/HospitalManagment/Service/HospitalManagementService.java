package com.HospitalManagment.HospitalManagment.Service;

import java.util.List;



import com.HospitalManagment.HospitalManagment.enities.Patient;

// when we want to change something we can directly change through interface
//its parent class
public interface HospitalManagementService {
	
	public List<Patient> getPatients();
	public Patient addPatient(Patient patient);
	public List<Patient> getPatients(String status);
}
