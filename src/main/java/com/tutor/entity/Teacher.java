package com.tutor.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_teacher")
public class Teacher  implements Serializable {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment") //设置主键自增
    @GeneratedValue(generator = "generator")
    @Column(name = "teacher_id")
    private Integer id;
    @Column(name="teacher_username")
    private String username;
    @Column(name="teacher_password")
    private String password;
    @Column(name = "teacher_realname")
    private String realname;
    @Column(name = "teacher_phonenum")
    private String phonenum;
    @Column(name = "teacher_idnum")
    private String idnum;//身份证号
    @Column(name = "teacher_Email")
    private String email;
    @Column(name = "role")
    private Integer role;//用户角色编号(0代表管理员，1代表学生，2代表老师)
    @Column(name = "teacher_add")
    private String add;
    @Column(name = "teacher_createDate")
    private Date createDate;
    @Column(name = "sex")
    private String sex;
    @Column(name="teacher_remaker")
    private String remaker;
    @Column(name="teacher_score")
    private Double score;

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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
