//(b)
class CRational{
public int n;
public int d;

public void setN(int num) {
 n=num;
}

public void setD(int num){
 d=num;
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
 show(aaa);
 bbb.setND(3,7);
 show(bbb);
}
public static void show(CRational obj){
 System.out.println(obj.n+"/"+obj.d);
}
	}

//2/5
//3/7