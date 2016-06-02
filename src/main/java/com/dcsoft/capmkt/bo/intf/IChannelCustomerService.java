package com.dcsoft.capmkt.bo.intf;

import java.io.Serializable;
import java.util.List;

public interface IChannelCustomerService extends IGenericService {
	public List<Serializable> getCustomerByExample(Serializable obj);
	public boolean addCustomer(Serializable obj);
}
