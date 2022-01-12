public class question{
	private String text,answer;
	private int value;
	public question(){
		this.text = "";
		this.answer = "";
		this.value = 0;
	}
	public question(String text){
		this.text = text;
		this.answer = "";
		this.value = 0;
	}
	public question(String text, String answer, int value){
		this.text = text;
		this.answer = answer;
		this.value = value;
	}
	public void change(String text, String answer, int value){
		this.text = text;
		this.answer = answer;
		this.value = value;
	}
	public String gettext(){
		return this.text;
	}
	public String getanswer(){
		return this.answer;
	}
	public int getvalue(){
		return this.value;
	}
	public void show(){
		System.out.println("Question: " + this.text);
		System.out.print("Answer: " + this.answer);
		System.out.println("(" + this.value + ")");
	}
	public void input(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter text: ");
		this.text = sc.nextLine();
		System.out.print("Enter answer: ");
		this.answer = sc.nextLine();
		System.out.print("Enter scores: ");
		this.value = sc.nextInt();
	}
	public String toString()
	{
		String st;
		st = "Question: " + this.text;
		st += "Answer: " + this.answer;
		st += "(" + this.value + ")";
		return st;
	}
}