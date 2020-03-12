package cn.yzstu;

import java.io.IOException;

/**
 * 类描述
 *
 * @author： 12405
 * @date: 2020/3/11-22:36
 */
public class Start {
    public static void main(String[] args) {
        int q = 1;
        int size = 0;
        long waitMin = 5;
        UrlCrawBoke urlCrawBoke = new UrlCrawBoke();
        while (true){
            try {
                System.out.println("程序第"+q+"次执行");
                size = urlCrawBoke.start() + size;
                System.out.println("本次累计刷新"+q+"次！增加访问量："+size+"！等待"+waitMin+"分钟再次刷新");
                q++;
                Thread.sleep(waitMin*60*1000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
