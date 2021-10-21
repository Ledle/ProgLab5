import java.util.*;
public class Demo{
	public static void main(String args[]){
		user u = new user(1212,333,"Ledle");
		group g = new group();
		System.out.print(g.adduser(u));
	}
}