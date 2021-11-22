import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HackableServerFrame extends MainFrame {
    private JTextField cUsersUserTextField;
    private JTextArea CTFPlatformVersion0TextArea;
    private JTextArea allEnabledCommandsAreTextArea;
    private JPanel HackMainFrame;


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
                    CTFPlatformVersion0TextArea.append(cUsersUserTextField.getText() + "\n" + "C:/Users/User>");
                    cUsersUserTextField.setText("");
                    cUsersUserTextField.setCaretPosition(cUsersUserTextField.getDocument().getLength());
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
    }

}
