public class oopsclassobj 
{
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolour("blue");
        p1.settip(5);
        System.out.println(p1.colour);
        System.out.println(p1.tip);
    }
    
}
class pen
{
    String colour;
    int tip;
    void setcolour(String newcolour)
    {
        colour=newcolour;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }
}
class Student
{
    String name;
    int age;
    float percentage;
}
