import java.util.*;
public class Demo{
	public static void main(String args[]){
		user serg = new user(111,22,"Sergey");
		user dima = new user(113,454,"Dmitry");
		group PI = new group("PI");
		question q1 = new question("2+2?","4",5);
		question q2 = new question("2+2*2?","6",10);
		test math = new test(new question[] {q1,q2},"Math");
		discipline progr = new discipline("Programming");
		discipline alg = new discipline("Algebra");
		progr.addgroup(PI);
		PI.adduser(serg);
		math.show();
		progr.addtest(math);
		PI.show();
		progr.show();
		serg.show();
		PI.adduser(dima);
		PI.show();
		PI.deluser(111);
		serg.show();
		PI.show();
		PI.adddisc(alg);
		PI.show();
		PI.deldisc("Programming");
		PI.show();
		math.addresult(dima.getlogin(),55);
		System.out.println("Result: " + math.getresult(dima.getlogin()));
	}
}