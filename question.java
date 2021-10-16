public class question{
	private String text,answer;
	private int value;
	public question(){
		this.text = "";
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
	public void show(){}
	public void input(){}
}