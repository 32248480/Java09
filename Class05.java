//(a),(b),(c),
class CCount{
private static int cnt=0;

public CCount(){
 count();
}
public static void count(){
 cnt++;
}
public static void setZero(){
 cnt=0;
}
public static void setValue(int n){
 cnt=n;
}
public static void show(){
 System.out.println("cnt="+cnt);
}
}

public class Main{
public static void main(String args[]){
 CCount cn1=new CCount();
 CCount cn2=new CCount();
 CCount.show();

 CCount.setZero();
 System.out.println("using setZero()...");
 CCount.show();

 CCount.setValue(10);
 System.out.println("using setValue(10)...");
 CCount.show();
}
}

//cnt=2
//using setZero()...
//cnt=0
//using setValue(10)...
//cnt=10

//(d),
//cnt應要利用類別變數,因為cnt是用來計算CCount類別所建立的物件個數,所以可以宣告成類別變數,讓所有的CCount類別物件共用。
//(e),
//count()method可以宣告成實例函數，也可以宣告成類別函數。不過因為count()宣告成實例函數時,是由物件呼叫的,對count()來說並不具有太大的意義，所以還是會建議將count()宣告成類別函數。
