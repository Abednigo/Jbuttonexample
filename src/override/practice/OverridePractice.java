/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package override.practice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Abednigo
 */
public class OverridePractice extends JFrame implements ActionListener {

    public JPanel testPanel;
    public JPanel testPanel2;
    public JPanel launchPanel;
    public JLabel onlabel;
    public JLabel offlabel;
    public JButton onbutton;
    public JButton offbutton;
    public JButton launch;
    public JPanel explosion;
    public JLabel fightclub;
    public OverridePractice()
    {
        
    super( "Testing" );
    Container contentPane = getContentPane();
    contentPane.setLayout(null);
    
    Icon fc= new ImageIcon( "fightclub.gif" );
    
    testPanel=new JPanel();
    testPanel.setBounds(40, 20, 276, 48 );
    testPanel.setBorder( BorderFactory.createEtchedBorder() );
    testPanel.setLayout( null );
    contentPane.add( testPanel );
    
    onlabel=new JLabel();
    onlabel.setBounds(25, 15, 100, 20);
    onlabel.setText( "Click to Turn On" );
    testPanel.add( onlabel );
    
    onbutton=new JButton();
    onbutton.setBounds(150, 15, 96, 25 );
    onbutton.setText("On");
    
    
    onbutton.addActionListener((ActionEvent ae) -> 
    {
        launch.setEnabled(true);
    });
    testPanel.add(onbutton);
    
    
    testPanel2=new JPanel();
    testPanel2.setBounds(40, 100, 276, 48 );
    testPanel2.setBorder( BorderFactory.createEtchedBorder() );
    testPanel2.setLayout( null );
    contentPane.add( testPanel2 );
    
    offlabel=new JLabel();
    offlabel.setBounds(25, 15, 100, 20);
    offlabel.setText( "Click to Turn Off" );
    testPanel2.add( offlabel );
    
    offbutton=new JButton();
    offbutton.setBounds(150, 15, 96, 25 );
    offbutton.setText("Off");
    offbutton.addActionListener((ActionEvent ae) -> 
    {
        launch.setEnabled(false);
        fightclub.setIcon(null);
    });
    testPanel2.add(offbutton);
    
    launchPanel=new JPanel();
    launchPanel.setBounds(40, 200, 276, 80 );
    launchPanel.setBorder( BorderFactory.createEtchedBorder() );
    launchPanel.setLayout( null );
    contentPane.add( launchPanel );
    
    launch=new JButton();
    launch.setText("Detonate");
    launch.setBounds(70, 25, 150, 25 );
    launch.setEnabled(false);
    launch.addActionListener((ActionEvent ae) -> 
    {
            fightclub.setIcon(fc);
    });
    launchPanel.add(launch);
    
    explosion=new JPanel();
    explosion.setBounds(40, 300, 550, 230 );
    explosion.setBorder( BorderFactory.createEtchedBorder() );
    explosion.setLayout( new FlowLayout() );
    contentPane.add( explosion );
    
    fightclub=new JLabel();
    explosion.add(fightclub);
   
    
     setTitle( "TestPractice" );   // set title bar string
     setSize( 650, 600 ); // set window size
     setVisible( true );  // display window
    
    
    }
   @Override
    public void actionPerformed(ActionEvent ae) 
    {
        launch.setEnabled(true);
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 
    
    
    public static void main(String[] args) 
    {
    OverridePractice application = new OverridePractice();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
   
}
