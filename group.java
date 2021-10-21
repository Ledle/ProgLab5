import java.util.*;
public class group{
	private ArrayList<user> students;
	private ArrayList<discipline> disciplines;
	private String name;
	public group(){
		this.name = "";
		this.students = new ArrayList<user>();
		this.disciplines = new ArrayList<discipline>();
	}
	public group(String name){
		this.name = name;
		this.students = new ArrayList<user>();
		this.disciplines = new ArrayList<discipline>();
	}
	public int adddisc(discipline disc){}
	public int adduser(user student){}
	public void rename(String name){}
	public void deldisc(String name){}
	public void delstudent(int login){}
	public void show(){}
	public void input(){}
	public String getname(){}
	public user getstudent(int n){}
}