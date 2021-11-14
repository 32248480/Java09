//(a),(b),(c),(d),(e),
class CWin{
private String color;
private int width;
private int height;
private static int cnt=0;

public CWin(String str,int w,int h){
 color=str;
 width=w;
 height=h;
 count();
}
public CWin(){
 this("Red",2,2);
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
 CWin w1=new CWin();
 CWin w2=new CWin("Blue",5,8);
 CWin.show();
 CWin.setZero();
 System.out.println("using setZero()...");
 CWin.show();

 CWin.setValue(10);
 System.out.println("using setValue(10)...");
 CWin.show();

 CWin w3=new CWin("Green",4,6);
 CWin.show();
}
}

//cnt=2
//using setZero()...
//cnt=0
//using setValue(10)...
//cnt=10
//cnt=11

//(f),
//cnt應要利用類別變數,因為cnt是用來計算CWin類別所建立的物件個數,所以可以宣告成類別變數,讓所有的CWin類別物件共用。
//(g),
//count()method可以定義成實例函數，也可以定義成類別函數。不過因為count()定義成實例函數時,是由物件呼叫的,對count()來說並不具有太大的意義，所以還是會建議將count()定義成類別函數。
