import java.util.*;
public class group{
	private ArrayList<user> students;
	private ArrayList<discipline> disciplines;
	private static ArrayList<group> groups = new ArrayList<group>();
	public static ArrayList<group> list(){
		return new ArrayList<group>(groups);
	}
	private String name;
	public group(){
		this.name = "";
		this.students = new ArrayList<user>();
		this.disciplines = new ArrayList<discipline>();
		groups.add(this);//добавление этой группы в общий список
	}
	public group(String name){
		this.name = name;
		this.students = new ArrayList<user>();
		this.disciplines = new ArrayList<discipline>();
		groups.add(this);//добавление этой группы в общий список
	}
	public group(String name, discipline[] disc, user[] students) {
		this.name = name;
		this.disciplines = new ArrayList<>(Arrays.asList(disc));
		this.students = new ArrayList<>(Arrays.asList(students));
	}
	public int adddisc(discipline disc){
		if(this.disciplines.indexOf(disc)==-1){
			disciplines.add(disc);
			disc.addgroup(this);//добавление в дисциплину данного объекта
		}
		return disciplines.size() - 1;
	}
	public int adduser(user student){
		if (students.indexOf(student)==-1){
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
				discipline d = disciplines.get(i);
				disciplines.remove(i);
				d.delgroup(this.name);
				break;
			}
		}
	}
	public void deluser(int login){
		for (int i=0;i<students.size();i++){
			if (students.get(i).getlogin() == login){
				user s = students.get(i);
				students.remove(i);
				s.delgroup();
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