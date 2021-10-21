import java.util.*;
public class test{
	private String name;
	private ArrayList<question> quest;
	private ArrayList<Integer> result;
	public test(){
		this.name = "";
		this.quest = new ArrayList<question>();
		this.result = new ArrayList<Integer>();
	}
	public test(question[] questions, String name){
		this.name = name;
		this.quest = new ArrayList<question>(Arrays.asList(questions));
		this.result = new ArrayList<Integer>();
	}
	public void addresult(int login, int res){
		result.add(login);
		result.add(res);
	}
	public void rename(String name){
		this.name = name;
	}
	public String getname(){
		return this.name;
	}
	public void show(){
		System.out.println("Test "+name+":");
		for(int i=0;i<quest.size();i++){
			System.out.println("Question "+i+")"+quest.get(i).gettext());
			System.out.println("Answer: "+quest.get(i).getanswer());
		}
	}
	public void input(){
		System.out.print("Enter name of test: ");
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		System.out.println("Enter number of questions: ");
		int n = sc.nextInt();
		quest = new ArrayList<question>(n);
		for(int i=0;i<n;i++){
			quest.add(new question());
			quest.get(i).input();
		}
	}
	public question getquest(int n){
		return this.quest.get(n);
	}
	public int getresult(int login){
		int n = result.indexOf(login);
		if (n==-1){
			return 0;
		}
		return result.get(n+1);
	}
}