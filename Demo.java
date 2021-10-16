public class Demo{
	question q;
	q.change("2+2?","4",15);
	System.out.println("Question: " + q.gettext());
	System.out.println("Answer: " + q.getanswer());
	System.out.println("Value: " + q.getvalue());
}