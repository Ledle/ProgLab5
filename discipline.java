import java.sql.Array;
import java.util.*;
public class discipline implements Cloneable{
	private String name;
	private ArrayList<test> tests;
	private ArrayList<group> groups;
	private static ArrayList<discipline> disciplines = new ArrayList<discipline>();//список всех дисциплин
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
	public discipline(String name, test[] tests, group[] groups) {
		this.name = name;
		this.tests = new ArrayList<>(Arrays.asList(tests));
		this.groups = new ArrayList<>(Arrays.asList(groups));
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
		if(gr == null){
			throw new NullPointerException();
		}
		if(this.groups.indexOf(gr)==-1){
			this.groups.add(gr);
			gr.adddisc(this);
		}
		return groups.size() - 1;
	}
	public int addtest(test tst){
		if(tst == null){
			throw new NullPointerException();
		}
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
	public String toString() {
		String st;
		st = "Discipline " + this.name + ":";
		if (this.groups.size() > 0)
		{
			st+=" Groups:";
			for (int i = 0; i < this.groups.size(); i++)
			{
				st+="  " + i + ") " + this.groups.get(i).getname();
			}
		}
		if (this.tests.size() >= 0)
		{
			st+=" Tests: " + this.tests.size();
		}
		return st;
	}
	public Object Clone()//глубокое клонирование
	{
		ArrayList<test> tsts = new ArrayList<test>();
		ArrayList<question> qsts = new ArrayList<question>();
		question[] quests;
		for (test t : tests)
		{
			if (t.getquest() != null) {
				for (question q : t.getquest()) {
					qsts.add(new question(q.gettext(), q.getanswer(), q.getvalue()));
				}
				quests = new question[qsts.size()];
				qsts.toArray(quests);
				tsts.add(new test(quests, t.getname()));
				qsts.clear();
			}
		}
		group[] grps = new group[groups.size()];
		for (int i = 0; i < groups.size(); i++)
		{
			grps[i] = (group)groups.get(i).Clone();
		}
		test[] tests = new test[tsts.size()];
		tsts.toArray(tests);
		return new discipline(name, tests, grps);
	}
	public static ArrayList<discipline> getlist(){
		return new ArrayList<discipline>(disciplines);
	}
}