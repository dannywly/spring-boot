package com.school.project.framework.services;

import com.school.project.framework.exceptions.SwpException;
import com.school.project.framework.models.AppAccessToken;

public interface WxAccessTokenService {
	AppAccessToken getAccessToken() throws SwpException;
	
	AppAccessToken persistenceAccessToken(AppAccessToken accessToken);
}
