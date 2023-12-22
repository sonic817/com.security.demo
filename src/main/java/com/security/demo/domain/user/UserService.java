package com.security.demo.domain.user;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public JSONObject getA() {
        JSONObject jsonResponse = new JSONObject();

        Integer a = userMapper.getA();

        jsonResponse.put("result", "true");
        jsonResponse.put("message", "");
        jsonResponse.put("data", a);
        return jsonResponse;
    }
}