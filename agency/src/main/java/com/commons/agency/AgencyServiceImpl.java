package com.commons.agency;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AgencyServiceImpl implements AgencyService{

	@Override
	public List<Agency> findAll() throws Exception {
		List<Agency> lst = new ArrayList<>();
		for(int i=0; i<5 ; i++) {
			Agency agency = new Agency(i, "agency name : "+i, "agency address : "+i, "000"+i);
			lst.add(agency);
		}
		return lst;
	}

}
