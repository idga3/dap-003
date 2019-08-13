import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User implements IUser{
		
		String nickname;
		
		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField2;
		private JTextArea ta;
		
		private static ChatRoom CR;
		
		public User(String nck, ChatRoom C){
			
			CR = C;
			this.nickname = nck;
			
			///////// Construcción de la ventana /////////
			
			JFrame frame = new JFrame("ChatRoom DAP - ["+nickname+"]");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(100, 100, 450, 300);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			frame.setContentPane(contentPane);
			contentPane.setLayout(null);
			frame.setVisible(true);
			
			///////// Campos de texto /////////
			
			textField = new JTextField();
			textField.setBounds(10, 170, 299, 80);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField2 = new JTextField();
			textField2.setBounds(319, 140, 100, 50);
			contentPane.add(textField2);
			textField2.setColumns(15);
			
			ta = new JTextArea(5, 50);
			ta.setBounds(10, 11, 299, 148);
			contentPane.add(ta);
			ta.setEditable(false);
		
			///////// Acciones /////////
			
			JButton btnEnviar = new JButton("Enviar");
			btnEnviar.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent arg0){
					
					String txt = textField.getText();
					textField.setText("");
					String user = textField2.getText();
					send(user, txt);
					
				}
			});
			btnEnviar.setBounds(319, 199, 89, 23);
			contentPane.add(btnEnviar);
		}
		
		public String getNickname(){
			return nickname;
		}

		@Override
		public void recive(String user, String msg) {
			
			ta.setText(ta.getText()+"\n"+user + ": "+msg);
		}

		@Override
		public void send(String user, String msg) {
			
			CR.send(nickname, user, msg);
		}
}