import java.util.*;
public class Demo{
	public static void main(String args[]){
        test t = new test();
        t.addresult(11,13);
        t.addresult(99,100);
        t.addresult(90,54);
        System.out.println(t.getresult(99));
	}
}