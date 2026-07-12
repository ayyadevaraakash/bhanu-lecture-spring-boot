package com.tcs.IrctcProject.response;

import java.time.LocalDateTime;

public class TrainResponse {
	LocalDateTime timestamp;
	String message;
	Object response;
	
	public TrainResponse(LocalDateTime timestamp, String message, Object response) {
		this.timestamp = timestamp;
		this.message = message;
		this.response = response;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
}
