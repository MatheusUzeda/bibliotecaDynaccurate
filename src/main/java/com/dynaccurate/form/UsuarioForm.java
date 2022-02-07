package com.dynaccurate.form;

import java.io.Serializable;

public class UsuarioForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
