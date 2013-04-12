/*
Francis Hinson, Binley Yang, Hiroyuki Asaga
Lab20.java, Lab20JFile.java, Lab20JFileTest.java, tester.txt
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

import sun.misc.IOUtils;

import java.awt.*;
import java.awt.event.*;

public class Lab20JFile extends JFrame {
	
	private JTextArea outputArea;
	private JScrollPane scrollPane;
	private Scanner file;
	
	public Lab20JFile() throws IOException {
		super( "Testing class File" );
			
		outputArea = new JTextArea();
		scrollPane= new JScrollPane(outputArea);
		add( scrollPane, BorderLayout.CENTER ); // add scrollPane to GUI
		setSize( 400, 400 ); // set GUI size
		setVisible( true ); // display GUI
		
	}
	
	private File getFile() {
		
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		int result = chooser.showOpenDialog(this);
		
		if (result == JFileChooser.CANCEL_OPTION){
			System.exit(1);
		}
		
		File name = chooser.getSelectedFile();
		
		if((name == null) || (name.getName().equals(""))) {
			JOptionPane.showMessageDialog(this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
		return name;
	}
	
	public void readFile() throws IOException{
		
		File name = getFile();
		
		if(name.exists()) {
			outputArea.setText(read(name));
		}
	}

	public static String read(File file) throws IOException {
		int len;
	      char[] chr = new char[4096];
	      final StringBuffer buffer = new StringBuffer();
	      final FileReader reader = new FileReader(file);
	      try {
	          while ((len = reader.read(chr)) > 0) {
	              buffer.append(chr, 0, len);
	          }
	      } finally {
	          reader.close();
	      }
	      return buffer.toString();
	  }
}