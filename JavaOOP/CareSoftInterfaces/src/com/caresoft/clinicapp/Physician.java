package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	
	private ArrayList<String> patientNotes;
	
	public Physician(int id) {
		this.id = id;
	}
    
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	@Override
	public boolean assignPin(int pin) {
		if(this.pin < 999) {
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(getID() != Integer.SIZE) {
			return true;
		}
		return false;
	}
	
    public ArrayList<String> getNotes() {
    	return patientNotes;
    }
    public void setNotes(ArrayList<String> notes){
    	this.patientNotes = notes;
    }

}
