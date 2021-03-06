package com.dcsoft.capmkt.bo.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.dcsoft.capmkt.bo.intf.ICommonService;
import com.dcsoft.capmkt.bo.transferobj.DropDown;
import com.dcsoft.capmkt.orm.BccCountry;
import com.dcsoft.capmkt.orm.BccStateRef;
import com.dcsoft.capmkt.orm.dao.impl.CommonDAO;

@Service
public class CommonServiceImpl extends GenericService implements ICommonService{
	
	private CommonDAO commonDAO;
	
	@Override
	public List<Serializable> list() {
		return null;
	}

	@Override
	public List<Serializable> findByExample(Class<?> clazz, Serializable obj) {
		return null;
	}

	@Override
	@Transactional
	public List<Serializable> getCountryCodes() {
		List<Serializable> countries = getCommonDAO().getCountryCodes();
		List<Serializable> dropDowns = new ArrayList<Serializable>();
		DropDown dropDown =null;
		for(int i=0;i<countries.size();i++){
			BccCountry country = (BccCountry) countries.get(i);
			dropDown = new DropDown(country.getCountryCodeEn().toUpperCase(),country.getCountryName().toUpperCase());
			dropDowns.add(dropDown);
		}
		return dropDowns;
	}


	@Override
	@Transactional
	public List<Serializable> getStates(String countryName) {
		List<Serializable> states =  getCommonDAO().getStates(countryName);
		List<Serializable> dropDowns = new ArrayList<Serializable>();
		DropDown dropDown =null;
		for(int i=0;i<states.size();i++){
			BccStateRef state = (BccStateRef) states.get(i);
			dropDown = new DropDown(state.getId().getStateCode().toUpperCase(),state.getStateName().toUpperCase());
			dropDowns.add(dropDown);
		}
		return dropDowns;
	}

	public CommonDAO getCommonDAO() {
		return commonDAO;
	}

	public void setCommonDAO(CommonDAO commonDAO) {
		this.commonDAO = commonDAO;
	}

}
