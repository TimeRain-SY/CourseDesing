package FourOperations_Demo;

import java.util.Scanner;

public class Exceptions {
    Scanner sn = new Scanner(System.in);
    int num = 0;
    public int Exceptions(){
        try{
            num = sn.nextInt();
        }catch (Exception e){
            sn.nextLine();
        }
        return num;
    }
    public int Exceptions2(){
        try{
            num = sn.nextInt();
        }catch (Exception e){
            sn.nextLine();
//          System.out.println("请输入有效数字");
            num = 1000;
        }
        return num;
    }
}
