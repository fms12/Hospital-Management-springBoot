package com.HospitalManagment.HospitalManagment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospitalManagment.HospitalManagment.dao.HospitalManagementDao;
import com.HospitalManagment.HospitalManagment.enities.Patient;

@Service
public class HospitalManagementServiceImpl implements HospitalManagementService {

	@Autowired
	private HospitalManagementDao hospitalManagementDao;
//	List<Patient> listPatient;


//	getting the list of the patients
	public List<Patient> getPatients() {
		return hospitalManagementDao.findAll();
	}

//	adding the patient inside the list
	@Override
	public Patient addPatient(Patient patient) {
//		listPatient.add(patient);
		hospitalManagementDao.save(patient);
		return patient;
	}

//	getting the list of patient by there status
	@Override
	public List<Patient> getPatients(String status) {
		List<Patient> st = new ArrayList<>();
		for (Patient patient : hospitalManagementDao.findAll()) {
			if (patient.getStatus().contentEquals(status)) {
				st.add(patient);
			}
		}
		return st;
		
		
	}

}
