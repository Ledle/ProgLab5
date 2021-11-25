import java.sql.Array;
import java.util.*;
public class discipline{
	private String name;
	private ArrayList<test> tests;
	private ArrayList<group> groups;
	private static ArrayList<discipline> disciplines = new ArrayList<discipline>();//список всех дисциплин
	public static ArrayList<discipline> list(){//получение копии списка всех дисциплин
		return new ArrayList<discipline>(disciplines);
	}
	public discipline(){
		this.name = "";
		this.tests = new ArrayList<test>();
		this.groups = new ArrayList<group>();
		disciplines.add(this);//добавление этой дисциплины в общий список
	}
	public discipline(String name){
		this.name = name;
		this.tests = new ArrayList<test>();
		this.groups = new ArrayList<group>();
		disciplines.add(this);//добавление этой дисциплины в общий список
	}
	public String getname(){
		return this.name;
	}
	public test gettest(int n){
		return tests.get(n);
	}
	public group getgroup(int n){
		return groups.get(n);
	}
	public int addgroup(group gr){
		if(this.groups.indexOf(gr)==-1){
			this.groups.add(gr);
			gr.adddisc(this);
		}
		return groups.size() - 1;
	}
	public int addtest(test tst){
		if(this.tests.indexOf(tst)==-1){
			this.tests.add(tst);
		}
		return tests.size() - 1;
	}
	public void rename(String name){
		this.name = name;
	}
	public void deltest(String name){
		for (int i=0;i<tests.size();i++){
			if (tests.get(i).getname() == name){
				tests.remove(i);
				break;
			}
		}
	}
	public void delgroup(String name){
		for (int i=0;i<groups.size();i++){
			if (groups.get(i).getname() == name){
				group g = groups.get(i);
				groups.remove(i);
				g.deldisc(this.name);
				break;
			}
		}
	}
	public void show(){
		System.out.println("Discipline " + this.name + ":");
		if (this.groups.size()>0){
			System.out.println(" Groups:");
			for(int i=0;i<this.groups.size();i++){
				System.out.println("  " + i + ") " + this.groups.get(i).getname());
			}
		}
		if (this.tests.size() >=0){
			System.out.println(" Tests: "+this.tests.size());
		}
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of discipline: ");
		this.name = sc.nextLine();
	}
}