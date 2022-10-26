package com.ditocorp.loja.entities.enums;

public enum VendaStatus {

	ABERTO(1), 
	ENCERRADO(2), 
	LIBERADO(3), 
	BLOQUEADO(4);

	private int code;

	private VendaStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static VendaStatus valueOf(int code) {
		for (VendaStatus value : VendaStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Status(código) inválido");
	}

}
