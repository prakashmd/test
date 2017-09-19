/**
 * 
 */
package com.anthem.tat.factmodel;

import org.joda.time.LocalDate;

/**
 * @author AF43847
 *
 */
public class UmServices {

	private Long refID;

	private Long seqNO;

	private LocalDate receivedDate;
	private LocalDate toDate;

	public Long getRefID() {
		return refID;
	}

	public void setRefID(Long refID) {
		this.refID = refID;
	}

	public Long getSeqNO() {
		return seqNO;
	}

	public void setSeqNO(Long seqNO) {
		this.seqNO = seqNO;
	}

	public LocalDate getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(LocalDate receivedDate) {
		this.receivedDate = receivedDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "UmServices [refID=" + refID + ", seqNO=" + seqNO + ", receivedDate=" + receivedDate + ", toDate="
				+ toDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((receivedDate == null) ? 0 : receivedDate.hashCode());
		result = prime * result + ((refID == null) ? 0 : refID.hashCode());
		result = prime * result + ((seqNO == null) ? 0 : seqNO.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
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
		UmServices other = (UmServices) obj;
		if (receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!receivedDate.equals(other.receivedDate))
			return false;
		if (refID == null) {
			if (other.refID != null)
				return false;
		} else if (!refID.equals(other.refID))
			return false;
		if (seqNO == null) {
			if (other.seqNO != null)
				return false;
		} else if (!seqNO.equals(other.seqNO))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}

}
