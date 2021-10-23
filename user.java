import java.util.Scanner;
public class user{
	private int login,password;
	private String name;
	private group grp;
	public user(){
		this.name = "";
		this.grp = null;
		this.login = 0;
		this.password = 0;
	}
	public user(int login,int password, String name){
		this.login = login;
		this.password = password;
		this.name = name;
		this.grp = null;
	}
	public void rename(String name){
		this.name = name;
	}
	public void changepass(int password){
		this.password = password;
	}
	public void delgroup(){
		if (this.grp!=null){
			this.grp.deluser(this.login);
		}
		this.grp = null;
	}
	public void changegroup(group gr){
		if(grp!=gr){
			gr.adduser(this);
			if (this.grp != null){
				this.grp.deluser(this.login);
			}
			this.grp = gr;
		}
	}
	public void show(){
	System.out.println("User: " + this.name);
	if (this.grp != null) {
		System.out.println(" Group: " + this.grp.getname());
	}
	System.out.println(" Login: " + this.login + " Password: "+ this.password);
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of student: ");
		this.name = sc.nextLine();
		System.out.print("Enter login: ");
		this.login = sc.nextInt();
		System.out.print("Enter password: ");
		this.password = sc.nextInt();
	}
	public String getname(){
		return this.name;
	}
	public int getlogin(){
		return this.login;
	}
	public group getgroup(){
		return this.grp;
	}
	public int getpass(){
		return this.password;
	}
}