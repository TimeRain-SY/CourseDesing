package FourOperations_Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        Exceptions e = new Exceptions();
        Scanner sn = new Scanner(System.in);
        Threads time = new Threads();
        boolean boo = true;
        int num = 0;
        int answer = 0;
        int i = 0;
        System.out.println("游戏规则: 根据公式输入正确答案,非整数结果取整数部分作答,答对一题加1分,答错一题不加分,共10题,总时间30秒");
        while (boo) {
            System.out.println("输入1 开始测试\n输入2 结束程序");
            num = e.Exceptions();
            switch (num) {
                //开始程序
                case 1: {
                    time.start();
                    for (i = 0; i < 10; i++) {
                        //生成题目
                        function.setTopic();
                        //写入答案
                        answer = e.Exceptions2();
                        //输出正确答案
                        function.answers();
                        //校验答案
                        function.count(answer);
                        //到时结束
                        }
                    System.out.println("作答结束,你的分数为: "+function.getScore());
                    System.exit(0);
                    break;
                }
                //结束程序
                case 2: {
                    boo = false;
                    break;
                }
                //其他处理
                default: {
                    System.out.println("请输入有效数字");
                    break;
                }
            }
        }
    }
}
