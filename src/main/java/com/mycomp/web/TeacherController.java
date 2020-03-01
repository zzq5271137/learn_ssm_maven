package com.mycomp.web;

import com.mycomp.domain.Teacher;
import com.mycomp.service.ITeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TeacherController {

    // 使用Spring注入service对象
    // @Autowired
    @Resource(name = "teacherService")
    private ITeacherService teacherService;

    @RequestMapping("/addTeacher")
    public String addTeacher(Teacher teacher) {
        // 接收参数
        System.out.println("Controller: 接收参数---" + teacher);

        // 调用service层, 把数据保存到数据库
        teacherService.saveTeacher(teacher);

        return "success";
    }

}
