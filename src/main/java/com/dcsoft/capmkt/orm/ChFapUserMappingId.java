package com.dcsoft.capmkt.orm;
// Generated Apr 7, 2016 1:42:57 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ChFapUserMappingId generated by hbm2java
 */
@Embeddable
public class ChFapUserMappingId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8040931370122709763L;
	private BigDecimal userid;
	private BigDecimal fapId;

	public ChFapUserMappingId() {
	}

	public ChFapUserMappingId(BigDecimal userid, BigDecimal fapId) {
		this.userid = userid;
		this.fapId = fapId;
	}

	@Column(name = "userid", length = 20)
	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	@Column(name = "fap_id", scale = 0)
	public BigDecimal getFapId() {
		return this.fapId;
	}

	public void setFapId(BigDecimal fapId) {
		this.fapId = fapId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChFapUserMappingId))
			return false;
		ChFapUserMappingId castOther = (ChFapUserMappingId) other;

		return ((this.getUserid() == castOther.getUserid()) || (this.getUserid() != null
				&& castOther.getUserid() != null && this.getUserid().equals(castOther.getUserid())))
				&& ((this.getFapId() == castOther.getFapId()) || (this.getFapId() != null
						&& castOther.getFapId() != null && this.getFapId().equals(castOther.getFapId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result + (getFapId() == null ? 0 : this.getFapId().hashCode());
		return result;
	}

}
