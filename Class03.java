class Caaa{
private int value;

public Caaa(){
 value=10;
 System.out.println("value="+value);
}

public Caaa(int i){
 value=i;
 System.out.println("value="+value);
}
}

public class Main{
public static void main(String args[]){
 Caaa obj1=new Caaa();
 Caaa obj2=new Caaa(12);
}
}

//value=10
//value=12
