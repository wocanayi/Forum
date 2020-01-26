package com.qtt.forum.vo;

import lombok.Data;

import java.util.List;

/**
 * Project name：Forum
 * Class name：PageBean
 * description：TODO
 * date：2020/1/25 15:20
 *
 * @author ：XC
 */
@Data
public class PageBean<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public PageBean(){

    }
    public PageBean(long c,List<T> list){
        code=0;
        msg="OK";
        count=c;
        data=list;
    }
}
