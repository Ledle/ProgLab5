import java.util.*;
public class Demo{
	public static void main(String args[]){
        question q0 = new question();
        question q1 = new question("2+20");
        question qall = new question("2+2", "4", 15);
        question[] qs = { new question("First"), new question("Second"), new question("Third") };//инициализация массива конструктором
        test t0 = new test();
        test t1 = new test("NameOnly");
        test tall = new test(qs,"AllParms");
        test[] tsts = { t0, t1, tall };
        user u0 = new user();
        user u1 = new user("Bob");
        user uall = new user(836, 444, "John");
        user[] usrs = { u0, u1, uall };
        discipline d0 = new discipline();
        discipline d1 = new discipline("JustName");
        discipline[] dscps = { d0, d1};
        group g0 = new group();
        group g1 = new group("OnlyName");
        group gall = new group("AllParms",dscps,usrs);
        group[] groups = { g0, g1, gall };
        discipline dall = new discipline("AllParms",tsts,groups);
	}
}