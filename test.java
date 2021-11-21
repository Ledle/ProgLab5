import java.util.*;
public class test{
	private String name;
	private question[] quest;//массив объектов quest
	private ArrayList<int[]> result;
	public test(){
		this.name = "";
		this.quest = new question[1];
		this.result = new ArrayList<int[]>();
	}
	public test(question[] questions, String name){
		this.name = name;
		this.quest = questions;
		this.result = new ArrayList<int[]>();
	}
	public void addresult(int login, int res){
		int[] b = new int[2];
		b[0]=login;
		b[1]=res;
		result.add(b);
	}
	public void rename(String name){
		this.name = name;
	}
	public String getname(){
		return this.name;
	}
	public void show(){
		System.out.println("Test "+name+":");
		for(int i=0;i<quest.length;i++){
			System.out.println("Question "+i+") "+quest[i].gettext());
			System.out.println("Answer: "+quest[i].getanswer());
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
	public question getquest(int n){
		return this.quest[n];
	}
	public int getresult(int login){
		int n = -1;
		for (int i = 0;i<result.size();i++){
			if (result.get(i)[0] == login){
				n = i;
				break;
			}
		}
		if (n==-1){
			return 0;
		}
		return result.get(n)[1];
	}
}