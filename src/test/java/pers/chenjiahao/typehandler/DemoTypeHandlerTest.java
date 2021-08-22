package pers.chenjiahao.typehandler;

import org.apache.ibatis.type.TypeHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.chenjiahao.typehandler.entity.*;
import pers.chenjiahao.typehandler.handler.UserInfoTypeHandler;
import pers.chenjiahao.typehandler.service.StudentService;
import pers.chenjiahao.typehandler.service.TeacherService;
import pers.chenjiahao.typehandler.service.UserService;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ChenJiahao(五条)
 * @Date 2021/8/21 19:48
 */
@SpringBootTest(classes = DemoTypehandlerApplication.class)
public class DemoTypeHandlerTest {

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Test
    void insertUserTest(){
        User user = new User();
        UserInfo userInfo = new UserInfo();
        userInfo.setPhone("17600000000");
        userInfo.setAddress("Xi'an");
        user.setName("五条");
        user.setUserInfo(userInfo);
        userService.save(user);
    }

    @Test
    void getUserTest(){
        User byId = userService.getById(1);
        System.out.println(byId);
    }

    @Test
    void insertTeacherTest(){
        Teacher teacher = new Teacher();
        teacher.setName("亢师傅");
        teacher.setTeacherLevel(TeacherLevelEnum.HIGH_LEVEL);
        teacherService.save(teacher);
    }

    @Test
    void getTeacherTest(){
        Teacher byId = teacherService.getById(1);
        System.out.println(byId);
    }

    @Test
    void insertStudentTest(){
        Student student = new Student();
        student.setName("五条");
        List<Transcript> transcripts = new ArrayList<>();
        transcripts.add(Transcript.builder().subject("语文").score(10).build());
        transcripts.add(Transcript.builder().subject("数学").score(100).build());
        transcripts.add(Transcript.builder().subject("英语").score(11).build());
        transcripts.add(Transcript.builder().subject("计算机").score(101).build());
        student.setTranscripts(transcripts);
        studentService.save(student);
    }

    @Test
    void getStudentTest(){
        Student byId = studentService.getById(1);
        System.out.println(byId);
    }
}
