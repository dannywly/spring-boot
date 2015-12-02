package com.school.project.framework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.project.framework.exceptions.PaserJsonStrException;
import com.school.project.framework.exceptions.SwpException;
import com.school.project.framework.models.AppAccessToken;
import com.school.project.framework.repository.WxAccessTokenRepository;
import com.school.project.framework.utils.JsonUtil;
import com.school.project.framework.wxapi.WxApiSolution;

@Component
public class WxAccessTokenServiceImpl implements WxAccessTokenService {
	@Autowired
	private WxApiSolution solution;
	
	@Autowired
	private WxAccessTokenRepository accessTokenRepository;
	
	@Override
	public AppAccessToken getAccessToken() throws SwpException {
		return JsonUtil.JsonStrToObject(solution.getAccessToken(), AppAccessToken.class);
	}
	
	@Override
	public AppAccessToken persistenceAccessToken(AppAccessToken accessToken) {
		
		accessTokenRepository.save(accessToken);
		return null;
	}

}
