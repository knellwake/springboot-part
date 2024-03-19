package com.wake.controller;

import com.wake.pojo.Emp;
import com.wake.pojo.User;
import com.wake.utils.Result;
import com.wake.utils.XmlParserUtils;
import org.dom4j.io.ElementModifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("hello")
public class HelloController {

    @PostMapping("listEmp")
    public Result showXml(){
        String file = getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if ("1".equals(gender)){
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });

        return Result.ok(empList);
    }


    @GetMapping("show")
    public String show(@RequestParam("name") String name, @RequestParam(name = "age",required = false) String age){
        System.out.println(name+"! Hello World! !" + age);
        return name+" Hello World! " + age ;
    }

    @GetMapping("show1")
    public Result show1(User user){
        System.out.println(user);
        user.setAge(99);
        return Result.ok(user);
    }

    @GetMapping("show2")
    public String show2(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return Arrays.toString(hobby);
    }

    @GetMapping("show3")
    public String show3(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return hobby.toString();
    }

    @GetMapping("show4")
    public String show4(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return updateTime.toString();
    }

    @PostMapping("list")
    public Result list(@RequestBody User user){
        List<User> list = new ArrayList<>();
        user.setName("DougWake");
        list.add(user);
        return Result.ok(list);
    }

    @GetMapping("path/{name}/{id}")
    public String path(@PathVariable String name,@PathVariable Integer id){
        System.out.println(name+" "+id);
        return name+" "+id;
    }

    @GetMapping("head")
    public String head(@RequestHeader String name){
        System.out.println(name);
        return name;
    }
}