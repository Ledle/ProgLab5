import java.util.*;
public class test implements Interface{
	private String name;
	private question[] quest;//массив объектов quest
	private Result res;
	public test(){
		this.name = "";
		this.quest = null;
		this.res = new Result();
	}
	public test(String name){
		this.name = name;
		this.quest = null;
		this.res = new Result();
	}
	public test(question[] questions, String name){
		this.name = name;
		this.quest = questions;
		this.res = new Result();
	}
	public void addresult(int login, int result){
		res.add(login,result);
	}
	public void rename(String name){
		this.name = name;
	}
	public String getname(){
		return this.name;
	}
	public void show(){
		System.out.println("Test "+name+":");
		if(quest != null) {
			for (int i = 0; i < quest.length; i++) {
				System.out.println("Question " + i + ") " + quest[i].gettext());
				System.out.println("Answer: " + quest[i].getanswer());
			}
		}
	}
	public void input(){
		System.out.print("Enter name of test: ");
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		System.out.println("Enter number of questions: ");
		int n = sc.nextInt();
		quest = new question[n];//создание массива длиной n
		for(int i=0;i<n;i++){
			quest[i] = new question(); //добавление объекта в массив
			quest[i].input();
		}
	}
	public question[] getquest(){
		if (quest == null){ return null;}
		return quest.clone();
	}
	public int getresult(int login){
		return res.get(login);
	}
	private class Result{
		private ArrayList<Integer> results;
		private ArrayList<Integer> logins;
		public Result(){
			this.results = new ArrayList<Integer>();
			this.logins = new ArrayList<Integer>();
		}
		public void add(int login, int res){
			this.results.add(res);
			this.logins.add(login);
		}
		public int get(int login){
			int n = logins.indexOf(login);
			if (n==-1){return n;}
			return results.get(n);
		}
		public String toString()
		{
			String st;
			st=("Test " + name + ":");
			for (int i = 0; i < quest.length; i++)
			{
				st+=("Question " + i + ")" + quest[i].gettext());
				st+=("Answer: " + quest[i].getanswer());
			}
			return st;
		}
	}
}