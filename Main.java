//(a),
class CRational{
 int n;
 int d;

public void setN(int num){
 n=num;
}
public void setD(int num){
 d=num;
}

public void show(){
 System.out.println(n+"/"+d);
}
public void setND(int num,int den){
 n=num;
 d=den;
}
}

public class Main{
public static void main(String args[]){
 CRational aaa=new CRational();
 CRational bbb=new CRational();
 aaa.setN(2);
 aaa.setD(5);
 aaa.show();
 bbb.setND(3,7);
 bbb.show();
}
}

//2/5
//3/7