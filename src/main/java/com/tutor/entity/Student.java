package com.tutor.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生实体，对应的是学生表t_student
 */
@Entity
@Table(name="t_student")
public class Student implements Serializable{
    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")
    @Column(name = "student_id")
    private Integer id;
    @Column(name="student_username")
    private String username;
    @Column(name="student_password")
    private String password;
    @Column(name = "student_realname")
    private String realname;
    @Column(name = "student_phonenum")
    private String phonenum;
    @Column(name = "student_idnum")
    private String idnum;//身份证号
    @Column(name = "student_email")
    private String email;
    @Column(name = "role")
    private Integer role;//用户角色编号(0代表管理员，1代表学生，2代表老师)
    @Column(name = "student_add")
    private String add;
    @Column(name = "student_createDate")
    private Date createDate;
    @Column(name = "student_sex")
    private String sex;
    @Column(name="student_remaker")
    private String remaker;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRemaker() {
        return remaker;
    }

    public void setRemaker(String remaker) {
        this.remaker = remaker;
    }
}
