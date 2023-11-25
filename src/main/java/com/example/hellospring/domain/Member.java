package com.example.hellospring.domain;

public class Member {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 데이터를 저장하기 위해서 시스템이 저장하는 id
    private Long id;
    private String name;

}
