package com.mycomp.service;

import com.mycomp.domain.Teacher;
import com.mycomp.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("teacherService")
@Transactional // 启用Spring事务管理
public class TeacherServiceImpl implements ITeacherService {

    // 使用Spring注入dao对象
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void saveTeacher(Teacher teacher) {
        // 把数据保存到数据库
        System.out.println("Service: 调用dao层保存数据---" + teacher);

        // 调用dao层保存数据
        teacherMapper.insertTeacher(teacher);
        System.out.println("保存完成");
    }

}
