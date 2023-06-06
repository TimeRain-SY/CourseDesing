import java.util.Random;
import java.util.Scanner;

public class Function {
//生成题目
    public void setTopic() {
        Random random = new Random();
        int num = random.nextInt(4) + 1;
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int answer = 0;
        //加
        if (num == 1){
            System.out.println(num1+"+"+num2+"= ?");
            answer = num1 + num2;
        }
        //减
        if (num == 2){
            System.out.println(num1+"-"+num2+"= ?");
            answer = num1 - num2;
        }
        //乘
        if (num == 3){
            System.out.println(num1+"*"+num2+"= ?");
            answer = num1 * num2;
        }
        //除
        if (num == 4){
            System.out.println(num1+"/"+num2+"= ?");
            answer = num1 / num2;
        }
    }
//输入检查
    public void input() {
        Scanner scn = new Scanner(System.in);

    }

//答案计算
//计时
//答案解析
}
