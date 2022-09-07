import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Team Scheduler"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //prevents frame from being resized
        this.setSize(1200, 600); // set x and y dimension of frame

        //ImageIcon image = new ImageIcon(""); creates an image icon
        //this.setIconImage(image.getImage); change icon of frame

        //this.getContentPane().setBackground(Color.GRAY);
        // this.getContentPane().setBackground(New Color ()); for RGB, or HEX

        JLabel titleLabel = new JLabel("Team Scheduler", JLabel.CENTER); // or JLabel label = new JLabel("text in here");
        titleLabel.setVerticalAlignment(JLabel.TOP);
        titleLabel.setFont(new Font("Futura", Font.PLAIN, 24));
        this.add(titleLabel);
        this.setVisible(true); // make frame visible
    }
}
