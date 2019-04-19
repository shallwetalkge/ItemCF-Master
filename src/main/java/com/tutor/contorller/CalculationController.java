package com.tutor.contorller;

import com.tutor.algorithm.SimDistance;
import com.tutor.entity.TeacherDistance;
import com.tutor.service.StudentService;
import com.tutor.service.TeacherDistanceService;
import com.tutor.service.TeacherGradeService;
import com.tutor.service.TeacherService;
import com.tutor.util.ApplicationContextUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;


@Controller
public class CalculationController  extends Thread {

    @RequestMapping("/main")
    public String Calculations() throws InterruptedException {
        Thread thread=new CalculationController();
        while (true){
            thread.start();
            thread.sleep(3000);
            return "main";
        }
    }

    public static void main(String[] args) {
        Thread thread=new CalculationController();
        thread.start();
    }

    @Override
    public void run() {
        StudentService studentService= (StudentService) ApplicationContextUtil.getBean("studentService");
        TeacherService teacherService= (TeacherService) ApplicationContextUtil.getBean("teacherService");
        TeacherDistanceService teacherDistanceService= (TeacherDistanceService) ApplicationContextUtil.getBean("teacherDistance");
        TeacherGradeService teacherGradeService= (TeacherGradeService) ApplicationContextUtil.getBean("teacherGradeService");
        Integer maxStudentId=studentService.getMaxStudentId();
        System.out.println("学生MaxId="+maxStudentId);
        Integer maxTeacherId=teacherService.getMaxTeacherId();
        System.out.println("教师MaxId="+maxTeacherId);
        HashMap<Integer,float[]> allArray=new HashMap<>();
        for (int i=1;i<=maxTeacherId;i++){
            float[] arr=new float[maxStudentId];
            for (int j=1;j<=maxStudentId;j++){
                System.out.println("TeacherId="+i+","+"StudentId="+j);
                Float a=teacherGradeService.getOnlyTeacherGrade(j,i).getTeacherScore1();
                Integer teacherId=teacherGradeService.getOnlyTeacherGrade(j,i).getTeacherId();
                arr[j-1]=a;
                System.out.println(a);
                if (j==maxStudentId){
                    allArray.put(teacherId,arr);
                }
            }
        }
        SimDistance simDistance=new SimDistance();
        for (int i=1;i<=maxTeacherId;i++){
            for (int j=1+i;j<=maxTeacherId;j++){
                if (i!=j){
                    float[] v1=allArray.get(i);
                    float[] v2=allArray.get(j);
                    double distance=simDistance.EuclideanDistance(v1,v2);
                    System.out.println("TeacherIdFilst="+j+","+"TeacherIdSecond="+i);
                    TeacherDistance teacherDistance=teacherDistanceService.getOnlyTeacherDistance(j,i);
                    teacherDistance.setTeacherDistance(distance);
                    teacherDistanceService.update(teacherDistance);
                }
            }
        }
        System.out.println("计算已完成，等待休眠失效后重新计算");
    }
}
