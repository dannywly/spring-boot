package com.school.project.framework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.project.framework.exceptions.SwpException;
import com.school.project.framework.models.App;
import com.school.project.framework.repository.SwpAppRepository;

@Component
public class SwpAppServiceImpl implements SwpAppService {
	
	private static final String APP_ID = "wxd3c798b231672956";
	
	@Autowired
	private SwpAppRepository appRepository;
	
	@Override
	public App findApp() throws SwpException {
		return appRepository.findOne(APP_ID);
	}

	@Override
	public String getAppId() {
		
		return APP_ID;
	}
	
}
