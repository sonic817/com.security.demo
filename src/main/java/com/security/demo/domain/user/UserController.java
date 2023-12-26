package com.security.demo.domain.user;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("a")
    @ResponseBody
    public JSONObject getA() {
        JSONObject jsonResponse = userService.getA();
        return jsonResponse;
    }

    @PostMapping("b")
    public JSONObject addB(
//            @RequestParam(value = "worldNo", required = true) String worldNo
    ) {
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("result", "true");
        jsonResponse.put("message", "");
        jsonResponse.put("data", "");
        return jsonResponse;
    }
}