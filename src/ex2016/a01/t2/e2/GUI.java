package ex2016.a01.t2.e2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;

public class GUI {
	
	private final static String PATH = System.getProperty("user.home") + File.separator +"a.txt";
	final File file = new File(PATH);
	List<Integer> list = new ArrayList<>();
    
    public GUI(String fileName){
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
        jbInc.addActionListener(e -> {
        	int incTwo = 2;
        	this.list.add(incTwo);
        	incTwo = incTwo * 2;
        });
        
        jbRand.addActionListener(e -> {
        	Random rgn = new Random(10);
        	this.list.add(rgn.nextInt());
        });
        
        j1.addActionListener(e -> this.list.add(1));
        
        jbOK.addActionListener(e -> {
        	System.out.println(this.list);
        	try (FileWriter file2 = new FileWriter(this.file)) {
        		file2.write(this.list.stream().map(elem -> elem.toString()).toString());
        	} catch (IOException e1) {
				e1.printStackTrace();
			}
        	this.list = new ArrayList<>();
        });
        
        jf.getContentPane().add(jp);
        jf.pack();
        jf.setVisible(true);
    }

}
