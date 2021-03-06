package com.dcsoft.capmkt.orm;
// Generated Apr 7, 2016 1:42:57 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BccStateRefId generated by hbm2java
 */
@Embeddable
public class BccStateRefId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4597758721494800993L;
	private String stateCode;
	private String countryCodeEn;

	public BccStateRefId() {
	}

	public BccStateRefId(String stateCode, String countryCodeEn) {
		this.stateCode = stateCode;
		this.countryCodeEn = countryCodeEn;
	}

	@Column(name = "state_code", nullable = false, length = 10)
	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Column(name = "country_code_en", nullable = false, length = 2)
	public String getCountryCodeEn() {
		return this.countryCodeEn;
	}

	public void setCountryCodeEn(String countryCodeEn) {
		this.countryCodeEn = countryCodeEn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BccStateRefId))
			return false;
		BccStateRefId castOther = (BccStateRefId) other;

		return ((this.getStateCode() == castOther.getStateCode()) || (this.getStateCode() != null
				&& castOther.getStateCode() != null && this.getStateCode().equals(castOther.getStateCode())))
				&& ((this.getCountryCodeEn() == castOther.getCountryCodeEn())
						|| (this.getCountryCodeEn() != null && castOther.getCountryCodeEn() != null
								&& this.getCountryCodeEn().equals(castOther.getCountryCodeEn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStateCode() == null ? 0 : this.getStateCode().hashCode());
		result = 37 * result + (getCountryCodeEn() == null ? 0 : this.getCountryCodeEn().hashCode());
		return result;
	}

}
