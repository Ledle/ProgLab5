public class Student extends user {
    private group grp = null;

    Student(){
        super();
    }
    Student(String name){
        super(name);
    }
    Student(int login,int password, String name){
        super(login,password,name);
    }
    public void delgroup(){
        if (this.grp!=null){
            this.grp.deluser(this.login);
        }
        this.grp = null;
    }
    public void changegroup(group gr){
        if(grp!=gr){
            gr.adduser(this);
            if (this.grp != null){
                this.grp.deluser(this.login);
            }
            this.grp = gr;
        }
    }
    public void show(){
        System.out.println("User: " + this.name);
        if (this.grp != null) {
            System.out.println(" Group: " + this.grp.getname());
        }
        System.out.println(" Login: " + this.login + " Password: "+ this.password);
    }
    public group getgroup(){
        return this.grp;
    }
    public String toString(){
        String st;
        st = "Student: " + this.name;
        if (grp != null)
        {
            st += " Group: " + grp.getname();
        }
        st += " Login: " + this.login + " Password: " + this.password;
        return st;
    }
}
