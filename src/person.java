public class person {
 private int number;
 private String name;
 
 
 
 public person(int phonenumber, String fname){ //constructor
	number = phonenumber;
	name = fname;
}




public int getNumber(){
	return number;
}

public String getName() {
	return name;
}

public void setNumber(int newnumber){
	number = newnumber;
}
public void setName(String newname){
	name = newname;
}


}