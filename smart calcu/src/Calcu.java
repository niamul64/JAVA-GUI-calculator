import javax.swing.*;
import java.lang.*;
import com.sun.java.accessibility.util.AccessibilityListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calcu extends JFrame{
	static Font f,f2,f3,f4,fildfont,lebFont;
	static ImageIcon icon;
	static char operator;
	static double ans,dflt;
	static String dfltStri,ansStri,operatorStri;
	public Calcu(){
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("CALCULATOR");
		setResizable(false);

		//icon setup
		icon =new ImageIcon(getClass().getResource("c.png"));
		setIconImage(icon.getImage());
		//icon setup

	}


	///////////////////////////////////////////////////////////////// main mathods
	public static void main(String[] args) {
		f=new Font("Arial",Font.BOLD,20);
		f2=new Font("Arial",Font.BOLD,22);
		f3=new Font("Arial",Font.BOLD,70);
		f4=new Font("Arial",Font.BOLD,35);
		fildfont=new Font("Arial",Font.BOLD,33);
		lebFont=new Font("Arial",Font.CENTER_BASELINE,15);
		operator='+';
		ans=0;
		dflt=0;
		dfltStri="";
		ansStri="0";
		operatorStri="";

		//frame create
		Calcu FRAME=new Calcu();
		//frame create

		//creating button & add

		JButton But0=new JButton("0");/////////
		But0.setBounds(5,300,62,45);
		But0.setFont(f2);
		FRAME.add(But0);
		JButton But1=new JButton("1");///////
		But1.setBounds(5,245,62,45);
		But1.setFont(f2);
		FRAME.add(But1);
		JButton But2=new JButton("2");/////////
		But2.setBounds(73,245,62,45);
		But2.setFont(f2);
		FRAME.add(But2);
		JButton But3=new JButton("3");////////
		But3.setBounds(140,245,62,45);
		But3.setFont(f2);
		FRAME.add(But3);
		JButton But4=new JButton("4");///////////
		But4.setBounds(5,190,62,45);
		But4.setFont(f2);
		FRAME.add(But4);
		JButton But5=new JButton("5");///////
		But5.setBounds(73,190,62,45);
		But5.setFont(f2);
		FRAME.add(But5);
		JButton But6=new JButton("6");//////////
		But6.setBounds(140,190,62,45);
		But6.setFont(f2);
		FRAME.add(But6);
		JButton But7=new JButton("7");///////
		But7.setBounds(5,135,62,45);
		But7.setFont(f2);
		FRAME.add(But7);
		JButton But8=new JButton("8");///////////
		But8.setBounds(73,135,62,45);
		But8.setFont(f2);
		FRAME.add(But8);
		JButton But9=new JButton("9");////////
		But9.setBounds(140,135,62,45);
		But9.setFont(f2);
		FRAME.add(But9);
		JButton Butplus=new JButton("+");//////////
		Butplus.setBounds(209,300,65,45);
		Butplus.setFont(f4);
		FRAME.add(Butplus);
		JButton Butminus=new JButton("-");////////
		Butminus.setBounds(209,245,65,45);
		Butminus.setFont(f4);
		FRAME.add(Butminus);
		JButton Butequal=new JButton("=");////////
		Butequal.setBounds(5,355,270,45);
		Butequal.setFont(f3);
		FRAME.add(Butequal);
		JButton Butdiv=new JButton("/");/////////////////
		Butdiv.setBounds(209,190,65,45);
		Butdiv.setFont(f4);
		FRAME.add(Butdiv);
		JButton Butmul=new JButton("X");///////////
		Butmul.setBounds(209,135,65,45);
		Butmul.setFont(f2);
		FRAME.add(Butmul);
		JButton Butper=new JButton("%");/////////////
		Butper.setBounds(209,80,65,45);
		Butper.setFont(f2);
		FRAME.add(Butper);
		JButton Butce=new JButton("CE");/////////////
		Butce.setBounds(73,80,62,45);
		Butce.setFont(f);
		FRAME.add(Butce);
		JButton Butc=new JButton("C");//////////////
		Butc.setBounds(5,80,62,45);
		Butc.setFont(f2);
		FRAME.add(Butc);
		JButton Butdot=new JButton(".");///////////////
		Butdot.setBounds(140,300,62,45);
		Butdot.setFont(f2);
		FRAME.add(Butdot);
		JButton Butroot=new JButton("sqrt");////////////////
		Butroot.setBounds(140,80,62,45);
		FRAME.add(Butroot);
		JButton But00=new JButton("00");////////////
		But00.setBounds(73,300,62,45);
		But00.setFont(f);
		FRAME.add(But00);

		//creating button & add

		//LABEL
		JLabel leb;

		leb=new JLabel("12 DIGITS CALCULATOR");
		leb.setBounds(55,2,300,20);
		leb.setFont(lebFont);
		FRAME.add(leb);
		//LABEL

		// Field////////////////////////////////
		JTextField tf;
		tf=new JTextField("0",12);	
		tf.setEnabled( false );
		tf.setBounds(5,25,230,40);

		tf.setFont(fildfont);
		
	    
		FRAME.add(tf);
		JTextField tf2;
		
		tf2=new JTextField(operatorStri,12);	
		tf2.setEnabled( false );
		tf2.setBounds(237,25,38,40);
		tf2.setFont(f);
		
		FRAME.add(tf2);
		// Field////////////////////////////

		//////BUTTORN   ACTION
		But1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="1";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="2";	

					tf.setText(dfltStri);
				}
			}
		}
				);
		But3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="3";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="4";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="5";	
					tf.setText(dfltStri);

				}
			}
		}
				);
		But6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="6";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="7";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="8";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					dfltStri+="9";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()!=0)
				{
					dfltStri+="0";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		But00.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()!=0 && dfltStri.length()<13)
				{
					dfltStri+="00";	
					tf.setText(dfltStri);
				}
			}
		}
				);
		Butce.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				dfltStri="";	
				tf.setText("0");	
			}
		}
				);
		Butdot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()<13)
				{
					if(dfltStri.length()==0)
						dfltStri+="0";	
					dfltStri+=".";	
					tf.setText(dfltStri);
				}		
			}
		}
				);
		Butc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				operator='+';
				ans=0;
				dflt=0;
				dfltStri="";
				ansStri="0";
				operatorStri="";
				tf.setText("0");		
			}
		}
				);
		Butper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()>0)
				dflt=Double.parseDouble(dfltStri);
				dflt/=100;
				ans*=dflt;
				ansStri=""+ans;
				dflt=0;
				dfltStri="";
				tf2.setText("");
				operator=' ';
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}
				tf.setText(ansStri);

			}
		}
				);
		Butmul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// equals to er por jodi number aseh
				if(dfltStri.length()>0 && operator==' ')
				{
					ans=Double.parseDouble(dfltStri);
					dfltStri="";
					dflt=0;
				}// equals to er por jodi number aseh
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);
				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{
					if(dflt==0)
						dflt=1;

					ans*=dflt;

				}
				else if(operator=='/')
				{
					if(dflt==0)
						dflt=1;

					ans/=dflt;

				}
				else if(ans==0 && dflt!=0)
				{
					ans=dflt;
				}
				ansStri=""+ans;

				dfltStri="";
				dflt=0;

				operator='*';
				tf2.setText("X");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		Butdiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// equals to er por jodi number aseh
				if(dfltStri.length()>0 && operator==' ')
				{
					ans=Double.parseDouble(dfltStri);
					dfltStri="";
					dflt=0;
				}// equals to er por jodi number aseh
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);
				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{
					if(dflt==0)
						dflt=1;

					ans*=dflt;

				}
				else if(operator=='/')
				{
					if(dflt==0)
						dflt=1;

					ans/=dflt;

				}
				else if(ans==0 && dflt!=0)
				{
					ans=dflt;
				}
				ansStri=""+ans;

				dfltStri="";

				dflt=0;
				operator='/';
				tf2.setText("/");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		Butminus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// equals to er por jodi number aseh
				if(dfltStri.length()>0 && operator==' ')
				{
					ans=Double.parseDouble(dfltStri);
					dfltStri="";
					dflt=0;
				}// equals to er por jodi number aseh
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);
				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{
					if(dflt==0)
						dflt=1;

					ans*=dflt;

				}
				else if(operator=='/')
				{
					if(dflt==0)
						dflt=1;

					ans/=dflt;

				}
				else if(ans==0 && dflt!=0)
				{
					ans=dflt;
				}
				ansStri=""+ans;

				dfltStri="";

				dflt=0;
				operator='-';
				tf2.setText("-");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		Butplus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// equals to er por jodi number aseh
				if(dfltStri.length()>0 && operator==' ')
				{
					ans=Double.parseDouble(dfltStri);
					dfltStri="";
					dflt=0;
				}// equals to er por jodi number aseh
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);
				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{
					if(dflt==0)
						dflt=1;

					ans*=dflt;

				}
				else if(operator=='/')
				{
					if(dflt==0)
						dflt=1;

					ans/=dflt;

				}
				else if(ans==0 && dflt!=0)
				{
					ans=dflt;
				}

				ansStri=""+ans;
				dfltStri="";

				dflt=0;
				operator='+';
				tf2.setText("+");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		Butequal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);

				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{
					if(dflt==0)
						dflt=1;
					ans*=dflt;

				}
				else if(operator=='/')
				{
					if(dflt==0)
						dflt=1;
					ans/=dflt;

				}
				else if(dflt>0)
				{
					ans=dflt;
				}
				ansStri=""+ans;

				dfltStri="";
				dflt=0;

				operator=' ';
				tf2.setText(" ");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		Butroot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(dfltStri.length()>0)
					dflt=Double.parseDouble(dfltStri);
				if(operator=='+')
				{
					ans+=dflt;
				}
				else if(operator=='-')
				{
					ans-=dflt;
				}
				else if(operator=='*')
				{

					ans*=dflt;

				}
				else if(operator=='/')
				{

					ans/=dflt;

				}
				else if(dflt>0 && ans==0)
				{
					ans=dflt;
				}
				dflt=0;
				ans=Math.sqrt(ans);
				ansStri=""+ans;

				dfltStri="";
				dflt=0;

				operator=' ';
				tf2.setText(" ");
				if(ansStri.length()>=13)
				{
					ansStri=ansStri.substring(0,12);
				}

				tf.setText(ansStri);		
			}
		}
				);
		//////BUTTORN   ACTION
		FRAME.setVisible(true);
	}

}
