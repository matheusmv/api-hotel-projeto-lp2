package com.matheus.apiprojetolp2.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.matheus.apiprojetolp2.dto.QuartoDTO;
import com.matheus.apiprojetolp2.dto.TarifaDTO;

@Document(collection = "hospedagem")
public class Hospedagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Date dataCheckIn;
	private Date dataCheckOut;

	private Set<QuartoDTO> quartos = new HashSet<>();

	private List<TarifaDTO> tarifas = new ArrayList<>();

	public Hospedagem() {

	}

	public Hospedagem(String id, Date dataCheckIn, Date dataCheckOut) {
		super();
		this.id = id;
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(Date dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public Date getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(Date dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	public Set<QuartoDTO> getQuartos() {
		return quartos;
	}

	public void setQuartos(Set<QuartoDTO> quartos) {
		this.quartos = quartos;
	}

	public List<TarifaDTO> getTarifas() {
		return tarifas;
	}

	public void setTarifas(List<TarifaDTO> tarifas) {
		this.tarifas = tarifas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospedagem other = (Hospedagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
