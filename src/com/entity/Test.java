package com.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

public class Test {

	public static void main(String[] args) {

		// 之前的写法
		Map<String, Map<Long, List<String>>> map = new HashMap<String, Map<Long, List<String>>>();
		
		//guava 写法
		Map<String, Map<Long, List<String>>> mapa = Maps.newHashMap();
	}
}
