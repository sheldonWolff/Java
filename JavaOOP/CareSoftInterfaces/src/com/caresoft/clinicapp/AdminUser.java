package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role;
    private ArrayList<String> securityIncidents;
	public AdminUser(Integer id, String role) {
		this.id = id;
		this.setRole(role);
		this.securityIncidents = new ArrayList<String>();
	}
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		
		return securityIncidents;
	}
	@Override
	public boolean assignPin(int pin) {
		if(this.pin < 99999) {
			return true;
		}
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(getID() != Integer.SIZE) {
			authIncident();
			return true;
		}
		return false;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    public ArrayList<String> getSecurityIncidents(){
    	return securityIncidents;
    }

}
