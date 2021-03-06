package com.dcsoft.capmkt.orm;
// Generated Apr 7, 2016 1:42:57 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ChChannelCustGrpMappingId generated by hbm2java
 */
@Embeddable
public class ChChannelCustGrpMappingId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6578388111460720142L;
	private BigDecimal groupId;
	private BigDecimal channelCustId;

	public ChChannelCustGrpMappingId() {
	}

	public ChChannelCustGrpMappingId(BigDecimal groupId, BigDecimal channelCustId) {
		this.groupId = groupId;
		this.channelCustId = channelCustId;
	}

	@Column(name = "group_id", scale = 0)
	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	@Column(name = "channel_cust_id", scale = 0)
	public BigDecimal getChannelCustId() {
		return this.channelCustId;
	}

	public void setChannelCustId(BigDecimal channelCustId) {
		this.channelCustId = channelCustId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ChChannelCustGrpMappingId))
			return false;
		ChChannelCustGrpMappingId castOther = (ChChannelCustGrpMappingId) other;

		return ((this.getGroupId() == castOther.getGroupId()) || (this.getGroupId() != null
				&& castOther.getGroupId() != null && this.getGroupId().equals(castOther.getGroupId())))
				&& ((this.getChannelCustId() == castOther.getChannelCustId())
						|| (this.getChannelCustId() != null && castOther.getChannelCustId() != null
								&& this.getChannelCustId().equals(castOther.getChannelCustId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGroupId() == null ? 0 : this.getGroupId().hashCode());
		result = 37 * result + (getChannelCustId() == null ? 0 : this.getChannelCustId().hashCode());
		return result;
	}

}
