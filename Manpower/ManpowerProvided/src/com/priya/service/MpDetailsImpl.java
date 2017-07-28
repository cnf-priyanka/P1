package com.priya.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.priya.dao.ManpowerDAO;
import com.priya.entity.ManpowerDetails;

public class MpDetailsImpl implements MpDetails {
	@Autowired
	private ManpowerDAO manpowerDAO;

	@Transactional
	public void addManpowerDetails( ManpowerDetails manpower){
		
		manpowerDAO.addManpowerDetails(manpower);
	}
	@Override
	public List<ManpowerDetails> getAllManpower(){
		return manpowerDAO.getAllManpower();
	}

}
