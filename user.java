import java.util.Scanner;
abstract public class user implements Interface{
	protected int login,password;
	protected String name;
	public user(){
		this.name = "";
		this.login = 0;
		this.password = 0;
	}
	public user(String name){
		this.name = name;
		this.login = 0;
		this.password = 0;
	}
	public user(int login,int password, String name){
		this.login = login;
		this.password = password;
		this.name = name.substring(0,1).toUpperCase().concat(name.substring(1));//делает первую букву заглавной
	}
	public void rename(String name){
		this.name = name;
	}
	public void changepass(int password){
		this.password = password;
	}
	public void show(){
	System.out.println("User: " + this.name);
	System.out.println(" Login: " + this.login + " Password: "+ this.password);
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of user: ");
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
	public int getpass(){
		return this.password;
	}
}