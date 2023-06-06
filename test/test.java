import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args){
        JFrame Window1 = new JFrame("测试");
        Container con = Window1.getContentPane();
        Window1.setBounds(20,100,188,108);
        Window1.setVisible(true);
        Window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
