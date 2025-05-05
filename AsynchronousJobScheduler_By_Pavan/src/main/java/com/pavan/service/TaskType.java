package com.pavan.service;

public enum TaskType {
	
	EMAIL, REPORT, DB;
	
	public static TaskType fromString(String type)
	{
		return TaskType.valueOf(type.toUpperCase());
	}

}
