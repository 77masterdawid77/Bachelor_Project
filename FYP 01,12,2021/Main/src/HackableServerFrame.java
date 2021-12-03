import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HackableServerFrame extends MainFrame {
    private JTextField cUsersUserTextField;
    private JTextArea CTFPlatformVersion0TextArea;
    private JTextArea allEnabledCommandsAreTextArea;
    private JPanel HackMainFrame;
    private JButton backToHomePage;


    public HackableServerFrame(){
        setContentPane(HackMainFrame);
        setTitle("CTF Platform page 2");
        //setSize(1000,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true); //true fullscreen
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        cUsersUserTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    CTFPlatformVersion0TextArea.append(cUsersUserTextField.getText() + "\n");

                    if (cUsersUserTextField.getText().toString().equalsIgnoreCase("cd")){
                        CTFPlatformVersion0TextArea.append("Challenge 1, Challenge 2, Challenge 3 \n");
                    }
                    else if (cUsersUserTextField.getText().toString().equalsIgnoreCase("cat")){
                        CTFPlatformVersion0TextArea.append("Which file do you want to open? - cat filename \n");
                    }
                    else if (cUsersUserTextField.getText().toString().equalsIgnoreCase("cat Challenge 1")){
                        CTFPlatformVersion0TextArea.append("Question 1 not implemented \n");
                    }

                    CTFPlatformVersion0TextArea.append("C:/Users/User>");
                    cUsersUserTextField.setText("");

                }
            };

        });
        CTFPlatformVersion0TextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE){
                    //to do

                }
            }
        });
        backToHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                MainFrame page1 = new MainFrame();
            }
        });
    }

}
