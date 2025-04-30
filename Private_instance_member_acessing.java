class Mobile{
    private String name;
    private int num;
    void Mob(){
    
        num=5;

    }
    void display(){
        System.out.println(num);
        System.err.println(name);
    }
    void mob2(){
        num=6;
        name="bj";
    }
}

public class Private_instance_member_acessing {
    public static void main(String[] args) {
        
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        m1.display();//in output their will be zero first because it is call first and  nothing is initialize so garbage valuewill be there 0 or null for string
        m1.Mob();
        m1.display();
        m2.mob2();
        m2.display();
    }
    
}
