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
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Lab20 {
	private Scanner file;

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter file or directory name. (Use C:/Users/Francis/Desktop/tester.txt)"); //////////////////// Part 1
		String f = input.nextLine();

		Lab20 application = new Lab20();
		System.out.println("This is what the file looks like initially:");
		application.read(f); //////////////////////////////////////////////////////////////////////// Part 3
		System.out.println("This is what the file looks like after the numbers are squared:");
		application.square(f); ////////////////////////////////////////////////////////////////////// Part 4
		application.read(f);
		System.out.println("This is what the file looks like after you add the tokens:");
		application.add(f); ///////////////////////////////////////////////////////////////////////// Part 2
		application.read(f);
		application.close();

	}

	public int squaring(int x){
		x = x*x;
		return x;
	}

	public static boolean check(String path){
		File name = new File(path);

		if(name.exists()){
			return true;
		}
		else{
			return false;
		}
	}

	public void read(String f){

		try{
			try {
				file = new Scanner(new File(f));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(file.hasNext()){
				System.out.println(file.next());
			}
		}
		catch(NoSuchElementException elementException){
			System.err.println("No Such Element Error");
			System.exit(1);
		}
		catch (IllegalStateException stateException){
			System.err.println("Illegal State Error");
			System.exit(1);
		}
	}

	public void square(String file) {
	    try {
	      File newFile = new File(file);
	      File temporaryFile = new File(newFile.getAbsolutePath() + ".tmp");

	      BufferedReader br = new BufferedReader(new FileReader(file));
	      PrintWriter pw = new PrintWriter(new FileWriter(temporaryFile));

	      String line = null;

	      while ((line = br.readLine()) != null) {
	    	  pw.println((int)Math.pow(Integer.parseInt(line),2));
	    	  pw.flush();
	      }
	      pw.close();
	      br.close();

	      if (!newFile.delete()) {
	        System.out.println("Error deleting file");
	        return;
	      } 

	      if (!temporaryFile.renameTo(newFile))
	        System.out.println("Error renaming file");

	    }
	    catch (NumberFormatException e) {
	    	 //The line is not a number
	    }
	    catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }
	    catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

	public void add(String f){

		BufferedWriter bw = null;
		Random random = new Random();
		try {
			bw = new BufferedWriter(new FileWriter(f, true));
			bw.newLine();
			for (int i = 0; i <= random.nextInt(10)+10; i++){
			bw.write(ranSring(random, "alskdfjas", 3) + random.nextInt(10));
			bw.newLine();
			bw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close(){
		if (file!= null){
			file.close();
		}
	}

	public static String ranSring(Random range, String chars, int length) //http://stackoverflow.com/questions/2863852/how-to-generate-a-random-string-in-java
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = chars.charAt(range.nextInt(chars.length()));
	    }
	    return new String(text);
	}
}