package com.dynaccurate.form;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EventoForm implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;

	private String eventType;

	private LocalDateTime eventDateTime = LocalDateTime.now();

	private String idUsuario;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}

}
