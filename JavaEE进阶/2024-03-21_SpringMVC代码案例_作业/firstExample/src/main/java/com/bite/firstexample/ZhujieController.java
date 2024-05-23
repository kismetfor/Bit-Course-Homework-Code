package com.bite.firstexample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zhujie")
public class ZhujieController {
    @RequestMapping("/renameParam")
    public String renameParam(@RequestParam("time") String creatTime) {
        return creatTime;
    }
    @RequestMapping("/renameParam1")
    public String renameParam1(@RequestParam(value = "time", required = false) String creatTime) {
        return creatTime;
    }
    @RequestMapping("/PersonRequestBody")
    public Object renameParam(@RequestBody Person person) {
        return person.toString();
    }
}
