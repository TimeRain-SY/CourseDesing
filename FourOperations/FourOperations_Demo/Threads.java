package FourOperations_Demo;

public class Threads extends Thread{
    Function function = new Function();
    long minPrime;
//    Threads(long minPrime){
//        this.minPrime = minPrime;
//    }
    public void run(){
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long usedTime_s = (endTime - startTime)/1000;
        if(usedTime_s == 30){
            System.out.println("作答时间结束,你的分数是:"+function.getScore());
            System.exit(0);
        }
    }
}
