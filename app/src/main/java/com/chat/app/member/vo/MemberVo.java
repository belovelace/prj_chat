package com.chat.app.member.vo;

import lombok.Data;

@Data
public class MemberVo {

/** 데이터의 정보를 잠는 vo
 * 1. 각 칼럼의 필드를 선언
 * 2. 기본생성자 : 유연성
 * 3.모든 필드를 초기화하는 생성자 : 유연성
 * 4. getter, setter : 접근 및 수정 가능
 * 5. 객체 정보를 문자열로 반환하는 to string : 디버깅 및 로그 활용
 * 우클릭 -> generate -> 선택
*/


    //ID 컬럼 (varchar(50))
    private String id;

    //NAME 컬럼 (varchar(150))
    private String name;

    //PROFILE 컬럼 (varchar(255))
    private String profile;

    //PWD 컬럼 (varchar(255))
    private String pwd;

    //PHONE 컬럼 (varchar(20))
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MemberVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public MemberVo(String id, String name, String profile, String pwd, String phone) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.pwd = pwd;
        this.phone = phone;
    }

    // 기본 생성자
    public MemberVo() {
    }

}//class
