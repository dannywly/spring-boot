package com.school.project.framework.utils;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.project.framework.exceptions.PaserJsonStrException;

public class JsonUtil {
	
	private static ObjectMapper mapper = new ObjectMapper() ;
	
	/**
	 * Convert json string to java object.
	 * @author Danny
	 * @param jsonStr
	 * @param obj
	 * @return
	 * @throws PaserJsonStrException
	 */
	public static <T> T JsonStrToObject(String jsonStr, Class<T> obj) throws PaserJsonStrException {
		T model = null;
		try {
			model = mapper.readValue(jsonStr, obj);
		} catch (IOException e) {
			throw new PaserJsonStrException();
		}
		
		return model;
	}
	
	
	public static String ObjectToJsonStr(Object obj) {
//		mapper.
		return null;
	}
	
}
