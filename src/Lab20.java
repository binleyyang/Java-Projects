import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Lab20 {
	
	private Scanner file;
	private ObjectOutputStream output;

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter file or directory name: ");
		String f = input.nextLine();


		Lab20 application = new Lab20();
		application.openFile(f);
		application.addFile(f);
		application.readFile();
		application.closeFile();

	}

	public void square(int a){
		a = a*a;
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

	public void openFile(String f){
		try{
			file = new Scanner(new File(f));
			//System.out.println("File exists");
		}
		catch (FileNotFoundException fileNotFoundException){
			System.err.println("File Not Found Error");
			System.exit(1);
		}
	}

	public void readFile(){

		try{
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

	public void addFile(String f){

		BufferedWriter bw = null;
		Random random = new Random();
		try {
			bw = new BufferedWriter(new FileWriter(f, true));
			bw.newLine();
			for (int i = 0; i <= random.nextInt(10)+10; i++){
				bw.write(randSring(random, "abcdefghijklmnopqrstuvwxyz", 3) + random.nextInt(10));
				bw.newLine();
				bw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeFile() {
		if (file!= null){
			file.close();
		}
	}

	public static String randSring(Random range, String chars, int length) //http://stackoverflow.com/questions/2863852/how-to-generate-a-random-string-in-java
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = chars.charAt(range.nextInt(chars.length()));
	    }
	    return new String(text);
	}
}