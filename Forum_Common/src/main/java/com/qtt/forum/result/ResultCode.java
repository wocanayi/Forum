package com.qtt.forum.result;

/**
 * Project name：Forum
 * Class name：ResultCode
 * description：TODO
 * date：2020/1/25 15:04
 *
 * @author ：XC
 */
public enum ResultCode {
    OK(200),ERROR(400),NOTFOUNT(404);

    private ResultCode(int v){
        val=v;
    }
    private int val;

    public int getVal() {
        return val;
    }
}
