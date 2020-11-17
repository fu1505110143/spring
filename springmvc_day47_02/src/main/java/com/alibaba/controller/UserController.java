package com.alibaba.controller;

import com.alibaba.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author :fuwei
 * @Date:2020/11/14 17:22
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/find")
    public String findByName(@RequestParam("name") String username){
        System.out.println (username);
        return "success";
    }
    @RequestMapping("/register")
    public String register(User user){
        System.out.println (user);
        return "success";
    }
    @RequestMapping("/deleteMore")
    public String deleteMore(@RequestParam List<Integer> ids){
        System.out.println (ids);
        return "success";
    }
    @RequestMapping("/findAll")
    public String find(@RequestBody User user){
        System.out.println (user);
        return "success";

    }
    @RequestMapping(method = RequestMethod.GET,path = "/{mid}/{gid}/{cid}")
    public String findCheckItem(@PathVariable("mid") int mid, @PathVariable("gid")
            int gid,@PathVariable("cid")  int cid){
        System.out.println (mid+"的"+gid+"de"+cid);
        return "success";
    }
    @RequestMapping(method = RequestMethod.POST,path = "/{mid}/{gid}/{cid}")
    public String findCheckItems(@PathVariable("mid") int mid, @PathVariable("gid")
            int gid,@PathVariable("cid")  int cid){
        System.out.println (mid+"的"+gid+"de"+cid);
        return "success";
    }
    @RequestMapping("/responseJson")
    @ResponseBody
    public User responseJson(){
        //模拟从数据库查询数据
        User user = new User();
        user.setUsername("周杰伦");
        user.setPassword("123456");
        user.setNickname("双节棍");
        user.setBirthday(new Date ());
        List<String> hobbiesList = new ArrayList<> ();
        hobbiesList.add("basketball");
        hobbiesList.add("football");
        user.setHobbies(hobbiesList);
        //将user转换成json响应给客户端
        return user;
    }
}
