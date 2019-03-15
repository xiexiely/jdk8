package methodRe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: 梓
 * @Date: 2019/3/2 13:45
 * @Description:
 */
public class SwingTest {

    public static void main(String[] args) {
        System.out.println("hello world");
        JFrame jFrame = new JFrame("My Jframe");
        JButton jButton = new JButton("My JButton");

        //增加事件处理器 点击触发事件
        jButton.addActionListener(e -> System.out.println("Button Pressed"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
}
