import java.util.*;
public class Demo{
	public static void main(String args[]){
		discipline[] discs = new discipline[1];
		discs[0] = new discipline("Math");
		user[] usrs = new user[1];
		usrs[0] = new Student("John");
		Student stdnts[] = new Student[1];
		stdnts[0] = (Student)usrs[0];
		group gr = new group("PI",discs,stdnts);
		System.out.println(gr.toString());
		group g = (group)gr.Clone();
		g.getstudent(0).rename("Mark");
		System.out.println(gr.toString());
		test[] tsts = new test[1];
		tsts[0] = new test("Test 1");
		group[] grps = new group[] { gr };
		discipline disc = new discipline("Physics", tsts, grps);
		System.out.println(disc.toString());
		discipline d = (discipline)disc.Clone();
		d.getgroup(0).rename("PS");
		System.out.println(disc.toString());
	}
}