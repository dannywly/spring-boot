package com.school.project.framework.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.project.framework.exceptions.SwpException;
import com.school.project.framework.models.AppAccessToken;
import com.school.project.framework.services.SwpAppService;
import com.school.project.framework.services.WxAccessTokenService;

public abstract class SwpAbstractController {
	//token
	public static final String ACCESS_TOKEN = "iwish";
	
	
	///////////////////////////////////////////////////////////////
	//
	//message type
	//
	/////////////////////////////////////////////////////////////////
	public static final String TEXT_TYPE = "text";
	public static final String IMAGE_TYPE = "image";
	public static final String VOICE_TYPE = "voice";
	public static final String VEDIO_TYPE = "video";
	public static final String LINK_TYPE = "link";
	public static final String SHORT_VEDIO_TYPE = "shortvideo";
	public static final String MUSIC_TYPE = "music";
	public static final String NEWS_TYPE = "news";
	public static final String TEXT_LOCATION_TYPE = "location";
	public static final String EVENT_TYPE = "event";
	public static final String SUBSCRIBE_TYPE = "subscribe";
	public static final String UNSUBSCRIBE_TYPE = "unsubscribe";
	public static final String SCAN_TYPE = "SCAN";
	public static final String LOCATION_TYPE = "LOCATION";
	public static final String CLICK_TYPE = "CLICK";
	public static final String VIEW_TYPE = "VIEW";
	
	//Component
	@Autowired
	private SwpAppService appService;
	@Autowired
	private WxAccessTokenService accessTokenService;
	
	private static Map<String, AppAccessToken> map = new HashMap<String, AppAccessToken>();
	
	public String getAccessToken() {
		String appId = appService.getAppId();
		
		AppAccessToken accessToken = map.get(appId);
		
		if (accessToken != null ) {
			return accessToken.getAccessToken();
		}
		
		try {
			accessToken = accessTokenService.getAccessToken();
			return accessToken.getAccessToken();
		} catch (SwpException e) {
			e.printStackTrace();
		}
		return accessToken.getAccessToken();
	}
	
}
