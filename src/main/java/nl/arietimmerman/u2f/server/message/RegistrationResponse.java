/*******************************************************************************
 * Copyright 2015 Arie Timmerman. All rights reserved.
 *******************************************************************************/
/*
 * Response of the client to the server when registering
 */

package nl.arietimmerman.u2f.server.message;

public class RegistrationResponse {

	private String sessionId;
	private byte[] clientData;
	private byte[] registrationData;
	
	public RegistrationResponse() {
		
	}
	
	public void setClientData(byte[] clientData) {
		this.clientData = clientData;
	}
	
	public void setRegistrationData(byte[] registrationData) {
		this.registrationData = registrationData;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	public byte[] getClientData() {
		return clientData;
	}
	
	public byte[] getRegistrationData() {
		return registrationData;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
}