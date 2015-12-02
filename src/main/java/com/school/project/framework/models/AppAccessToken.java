package com.school.project.framework.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
public class AppAccessToken implements Serializable{
	@NotNull
	private long createTime;
	
	@NotNull
	private long updateTime = new Date().getTime();
	
	@Id
	@NotNull
	private String accessToken;
	
	@NotNull
	private long expiresIn;
	
	@OneToOne
	@JoinColumn(name = "app_id")
	private App appId;
	
	public App getAppId() {
		return appId;
	}

	public void setAppId(App appId) {
		this.appId = appId;
	}


	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}
	
	
}
