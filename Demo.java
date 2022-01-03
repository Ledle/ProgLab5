import java.util.*;
public class Demo{
	public static void main(String args[]){
            discipline d = new discipline("Math");
            test t = new test("Test");
            try{
                d.addtest(null);
            }
            catch(NullPointerException e) {
                d.addtest(t);
            }
            d.gettest(0).show();
	}
}