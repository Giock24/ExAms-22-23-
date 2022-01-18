package ex2016.a01.t2.e2;

import java.util.Random;

import javax.swing.*;

public class GUI {
	
	private final Controller c1 = new ControllerImpl();
    
    public GUI(String fileName){
    	
    	c1.nameFile(fileName);
    	
        JFrame jf = new JFrame();
        
        JButton jbInc = new JButton("INCINC");
        JButton jbRand = new JButton("RAND");
        JButton j1 = new JButton("UNO");
        JButton jbOK = new JButton("OK");
        
        //jbOK.addActionListener(e -> System.exit(1));
        JPanel jp = new JPanel();
        jp.add(jbInc);
        jp.add(jbRand);
        jp.add(j1);
        jp.add(jbOK);
        
        /* Handlers */
        jbInc.addActionListener(e -> c1.mulByTwo());
        
        jbRand.addActionListener(e -> c1.addElement(() -> {
        	final Random rand = new Random();
        	return (rand.nextInt(100) * -1);
        }));
        
        j1.addActionListener(e -> c1.addElement(() -> 1));
        
        jbOK.addActionListener(e -> {
        	System.out.println(c1.getCurrentSequece());
        	c1.writeAll();
        });
        
        jf.getContentPane().add(jp);
        jf.pack();
        jf.setVisible(true);
    }

}
