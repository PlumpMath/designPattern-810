package com.design.pattern1;

/**
 * Created by yongjunjung on 2015. 12. 9..
 */
public class Banner {

    private String string;
    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.print("("+string+")");
    }

    public void showWithAster() {
        System.out.print("*"+string+"*");
    }
}
