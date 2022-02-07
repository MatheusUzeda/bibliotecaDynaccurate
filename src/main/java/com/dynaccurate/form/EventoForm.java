package com.dynaccurate.form;

import java.io.Serializable;

public class EventoForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String eventType;

	private String idUsuario;

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

}
