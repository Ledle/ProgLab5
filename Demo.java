import java.util.*;
public class Demo{
	public static void main(String args[]){
        discipline[][] discips = new discipline[2][2];
        discips[0][0] = new discipline("Math");
        discips[0][1] = new discipline("Physics");
        discips[1][0] = new discipline("English");
        discips[1][1] = new discipline("Philosophy");
        group[] groups = new group[2];
        groups[0] = new group("PS");
        groups[1] = new group("PI");
        user[][] users = new user[2][3];
        users[0][0] = new user("Andrey");
        users[0][1] = new user("Sergey");
        users[0][2] = new user("Ivan");
        users[1][0] = new user("John");
        users[1][1] = new user("Marty");
        users[1][2] = new user("Kyle");
        question[] questions = new question[16];
        String quest,answer;
        for (int i = 0; i < questions.length; i++)
        {
            quest = String.valueOf(i) + "+" + String.valueOf(i*2);
            answer = String.valueOf(i + i * 2);
            questions[i] = new question(quest,answer,i+5);
        }
        test[] tests = new test[2];
        question[] quests= new question[8];
        for (int i = 0;i < tests.length; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                quests[j] = questions[j + 8 * i];
            }
            tests[i] = new test(quests, "Test #" + String.valueOf(i + 1));
        }
        for (int i = 0; i < groups.length; i++)
        {
            for (int j = 0; j < users[i].length; j++)
            {
                groups[i].adduser(users[i][j]);
            }
            for (int j = 0; j < discips[i].length; j++)
            {
                groups[i].adddisc(discips[i][j]);
            }
        }
        groups[0].show();
        groups[1].show();
	}
}