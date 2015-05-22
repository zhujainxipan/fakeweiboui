package com.zhang.fakeweibo.pojo;

/**
 * Created by annuo on 2015/5/21.
 */
public class DongTai {
    private String name;
    private String content;

    public DongTai(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
