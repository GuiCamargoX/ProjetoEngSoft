package engsoft.cond.screen;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import engsoft.cond.control.LoginManager;

public class GoogleLoginScreen extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;    
    
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 600;
    
    public GoogleLoginScreen() {
        
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel title = new JLabel("Sistema de Condom�nios - Login", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 14));    
        title.setAlignmentX(CENTER_ALIGNMENT);
        
        JLabel info = new JLabel("Copie o c�digo de autentica��o: ", JLabel.CENTER);
        info.setAlignmentX(CENTER_ALIGNMENT);
        
        JTextField cod = new JTextField();
        cod.setMaximumSize(new Dimension(DEFAULT_WIDTH - 50, 30));
        cod.setAlignmentX(CENTER_ALIGNMENT);
        
        JButton googleLogin = new JButton("Finalizar login");
        googleLogin.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginManager.getInstance().doGoogleLogin(cod.getText());                
            }
        });
        googleLogin.setAlignmentX(CENTER_ALIGNMENT);

        this.add(Box.createRigidArea(new Dimension(DEFAULT_WIDTH, 20)));
        this.add(title);
        this.add(Box.createRigidArea(new Dimension(DEFAULT_WIDTH, 20)));
        this.add(info);
        this.add(Box.createRigidArea(new Dimension(DEFAULT_WIDTH, 10)));
        this.add(cod);
        this.add(Box.createRigidArea(new Dimension(DEFAULT_WIDTH, 20)));
        this.add(googleLogin);
        
    }

}
