package com.mungerz.service;

import java.util.Map;

// Service层接口
public interface ApiService {
    Map<String, Object> info(Map<String, Object> params);
    Map<String, Object> insert(Map<String, Object> params);
}
