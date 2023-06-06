package FourOperations_Demo;

import java.util.Random;
import java.util.Scanner;

public class Function {
    Scanner scn = new Scanner(System.in);
    int answer = 0;
    static int score = 0;

    //数据输入
    public void setAnswer(int answer) {
        this.answer = answer;
    }

    //生成题目
    public void setTopic() {
        Random random = new Random();
        int num = random.nextInt(4) + 1;
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        //加
        if (num == 1) {
            System.out.println(num1 + "+" + num2 + "= ?");
            answer = num1 + num2;
        }
        //减
        if (num == 2) {
            System.out.println(num1 + "-" + num2 + "= ?");
            answer = num1 - num2;
        }
        //乘
        if (num == 3) {
            System.out.println(num1 + "*" + num2 + "= ?");
            answer = num1 * num2;
        }
        //除
        if (num == 4) {
            System.out.println(num1 + "/" + num2 + "= ?");
            answer = num1 / num2;
        }
    }

    //答案计算
    public void count(int answer) {
        if (answer == this.answer) {
            ++score;
            System.out.println("答案正确,分数+1,当前分数: " + score);
        } else {
            System.out.println("答案错误,当前分数: " + score);
        }
    }
    //答案解析
    public void answers() {
        System.out.println("正确答案: " + answer);
    }
    public int getScore(){
        int score = this.score;
        return score;
    }
}
