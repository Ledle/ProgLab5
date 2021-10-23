import java.util.*;
public class Demo{
	public static void main(String args[]){
		user serg = new user(111,22,"Sergey");
		group PI = new group("PI");
		question q1 = new question("2+2?","4",5);
		question q2 = new question("2+2*2?","6",10);
		test math = new test(new question[] {q1,q2},"Math");
		discipline progr = new discipline("Programming");
		PI.adduser(serg);
		math.getquest(0).show();
		math.show();
		progr.addtest(math);
		PI.getstudent(0).show();
		PI.show();
		progr.show();
		user dima = new user(113,454,"Dmitry");
		PI.deluser(111);
		PI.show();
		PI.adduser(dima);
		PI.show();
		PI.adduser(serg);
		PI.show();
		progr.delgroup(PI.getname());
	}
}