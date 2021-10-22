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
	public int adddisc(discipline disc){
		if(this.disciplines.indexOf(disc)==-1){
			disciplines.add(disc);
			disc.addgroup(this);
		}
		return disciplines.size() - 1;
	}
	public int adduser(user student){
		if (students.indexOf(student)!=-1){
			students.add(student);
			student.changegroup(this);
		}
		return students.indexOf(student);
	}
	public void rename(String name){
		this.name = name;
	}
	public void deldisc(String name){
		for (int i=0;i<disciplines.size();i++){
			if (disciplines.get(i).getname() == name){
				disciplines.get(i).delgroup(this.name);
				disciplines.remove(i);
				break;
			}
		}
	}
	public void delstudent(int login){
		for (int i=0;i<students.size();i++){
			if (students.get(i).getlogin() == login){
				students.get(i).changegroup(null);
				students.remove(i);
				break;
			}
		}
	}
	public void show(){
	System.out.println("Group " + this.name);
	if (this.students.size() > 0) {
		for (int i = 0; i < this.students.size(); i++) {
			System.out.println(" " + i + ") Name: "+this.students.get(i).getname()+" Login: " + this.students.get(i).getlogin());
		}
	}
	if (this.disciplines.size() > 0) {
		System.out.println(" Disciplines:");
		for (int i = 0; i < this.disciplines.size(); i++) {
			System.out.println("  "+i+") Discipline: " + this.disciplines.get(i).getname());
		}
	}
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of groups: ");
		this.name = sc.nextLine();
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		this.students = new ArrayList<user>(n);
		for (int i = 0;i<n;i++){
			this.students.add(new user());
			this.students.get(i).input();
		}
	}
	public String getname(){
		return this.name;
	}
	public user getstudent(int n){
		return this.students.get(n);
	}
}