package com.dynaccurate.form;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UsuarioForm implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String nickName;

	private LocalDateTime registrationDate = LocalDateTime.now();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	
	
}
