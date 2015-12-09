package com.design.pattern1;

/**
 * Created by yongjunjung on 2015. 12. 9..
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
