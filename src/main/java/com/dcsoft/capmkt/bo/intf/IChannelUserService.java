package com.dcsoft.capmkt.bo.intf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.dcsoft.capmkt.bo.transferobj.ChUserTO;
import com.dcsoft.capmkt.orm.ChUser;

public interface IChannelUserService extends IGenericService {
	public ChUser getUserDetails(BigDecimal id);
	public boolean addUser(ChUserTO chUserTO);
	public List<Serializable> getUserByLoginID(String loginID);
	public void removeUser(BigDecimal id);
	public List<Serializable> getUserByExample(ChUserTO userTO);
}
