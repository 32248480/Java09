class Cmath{
public static void power(int x,int n){
 int sum=1;
 for(int i=1;i<=n;i++)
 sum*=x;
 System.out.println(x+"ªº"+n+"¦¸¤è="+sum);
}
}

public class Main{
public static void main(String args[]){
 Cmath.power(2,5);
 Cmath.power(3,2);
}
}

//1+2+...+5=15
//1+2+...+10=55	
