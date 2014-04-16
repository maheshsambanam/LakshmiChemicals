package com.lakshmi.chemicals.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax")
public class Tax {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tax_id")
	private int taxId;
	@Column(name = "ex_duty")
	private int exDuty;
	@Column(name = "edn_cess")
	private int ednCess;
	@Column(name = "sh_edn_cess")
	private int shEdnCess;
	@Column(name = "tn_vat")
	private int tnVatTin;

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public int getExDuty() {
		return exDuty;
	}

	public void setExDuty(int exDuty) {
		this.exDuty = exDuty;
	}

	public int getEdnCess() {
		return ednCess;
	}

	public void setEdnCess(int ednCess) {
		this.ednCess = ednCess;
	}

	public int getShEdnCess() {
		return shEdnCess;
	}

	public void setShEdnCess(int shEdnCess) {
		this.shEdnCess = shEdnCess;
	}

	public int getTnVatTin() {
		return tnVatTin;
	}

	public void setTnVatTin(int tnVatTin) {
		this.tnVatTin = tnVatTin;
	}

}
