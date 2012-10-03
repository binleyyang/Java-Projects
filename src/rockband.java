public class rockband{

person singer, drummer, guitarist;

public rockband(person p1, person p2, person p3) {

singer= p1;
drummer=p2;
guitarist=p3;

}


public rockband(String name1,String name2, String name3, int num1, int num2, int num3){

singer = new person(num1, name1);
drummer = new person(num2, name2);
guitarist = new person(num3, name3);

}

}