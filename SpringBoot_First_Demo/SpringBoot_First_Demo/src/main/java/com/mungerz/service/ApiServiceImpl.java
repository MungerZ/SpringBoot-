package com.mungerz.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

// Service注解：说明该类是一个Service类，从逻辑上我们可以知道这个类属于Service层，应该写业务逻辑；从功能上，这个类是可以通过Autowired注解注入的。
@Service
public class ApiServiceImpl implements ApiService {

    @Override
    public Map<String, Object> info(Map<String, Object> params) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", "hello world");
        return result;
    }

}
