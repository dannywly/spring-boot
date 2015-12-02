package com.school.project.framework.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.project.framework.models.AppAccessToken;

public interface WxAccessTokenRepository extends CrudRepository<AppAccessToken, String> {
	
}
