//(a),
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

//(b),
//21行的程式碼是呼叫第6行沒有引數的建構元Caaa()。22行的程式碼是呼叫第11行有引數的建構元Caaa(int i)。
//(c),
//Caaa類別無法宣告成public,因為一個檔案裡只可以有一個public的類別,並會和程式儲存的文字檔名相同。如果要將Caaa類別宣告成public,就要將Caaa類別存另外一個檔案,同時該檔案的名稱要為Caaa.java。
//(d),
//因為成員value並沒有被其他的類別使用,所以當value宣告成public,也不會影響到本範例的執行。
