import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends user implements Interface {
    private ArrayList<discipline> discips = new ArrayList<discipline>();
    public Teacher(){
        super();
    }
    public Teacher(String name){
        super(name);
    }
    public Teacher(int login,int password, String name,discipline disc){
        super(login,password,name);
        if (!discips.contains(disc))
        {
            discips.add(disc);
        }
    }
    public ArrayList<discipline> getDiscips(){
        return new ArrayList<discipline>(discips);
    }
    public void adddisc(discipline disc) {
        if (!discips.contains(disc))
        {
            discips.add(disc);
        }
    }
    public void deldisc(discipline disc)
    {
        discips.remove(disc);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of teacher: ");
        this.name = sc.nextLine();
        System.out.print("Enter login: ");
        this.login = sc.nextInt();
        System.out.print("Enter password: ");
        this.password = sc.nextInt();
        System.out.print("Enter discipline: ");
        String name = sc.nextLine();
        boolean f=true;
        for (int i = 0; i < discipline.getlist().size(); i++)
        {
            if (discipline.getlist().get(i).getname() == name)
            {
                adddisc(discipline.getlist().get(i));
                f = false;
                break;
            }
        }
        if (f)
        {
            adddisc(new discipline(name));
        }
    }
    public String toString(){
        String st;
        st = "Teacher: " + this.name;
        if (discips.size() != 0) { st += "Disciplines:"; }
        for (discipline d : discips)
        {
            st+= d.getname();
        }
        st += " Login: " + this.login + " Password: " + this.password;
        return st;
    }
}
