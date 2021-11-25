import java.util.*;
public class Demo{
	public static void main(String args[]){
        discipline d1 = new discipline("Math");
        discipline d2 = new discipline("Physic");
        discipline d3 = new discipline("Programming");
        discipline d4 = new discipline("Economics");
        group g1 = new group("PI01");
        group g2 = new group("PI02");
        group g3 = new group("PI03");
        group g4 = new group("PI04");
        System.out.println("groups:");
        for (group g:group.list())
        {
            g.show();
        }
        System.out.println("disciplines: ");
        for (discipline d:discipline.list())
        {
            d.show();
        }
	}
}