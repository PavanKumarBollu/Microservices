package com.pavan.model;

import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobRequest {

	private String taskType;
	private Map<String, String> params;
	
}
