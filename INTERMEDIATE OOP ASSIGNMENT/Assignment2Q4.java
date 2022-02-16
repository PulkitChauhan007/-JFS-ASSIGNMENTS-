abstract class name {
    String name;
    name(String name){
        this.name =name;
    }
    public  abstract String getname();
}
class person extends name{
    person(String name) {
        super(name);
    }
    @Override
    public  String getname(){
        return ("Hello,"+this.name);
    }
}
 abstract class MyClass {
    public abstract void dis1();
}
class  AbstClassP3 extends MyClass{
    @Override
    public void dis1(){
        System.out.println("It is a Subclass Implementation oF the Display Method.");
    }
}
abstract class MyClass2 {
    public abstract void dis2();
}

class AbstClassP4 extends MyClass2{
    public void dis2(){
        System.out.println("It is not a Private Class.");
    }
}
abstract class MyClass3 {
    public void dis3(){
        System.out.println("It is An Abstract Class Without An Abstract Method.");
    }
}
class AbstClassP6 extends MyClass3{
}
public class Assignment2Q4 {
    public static void main(String[] args) {
        person user1 = new person("PULKIT CHAUHAN 007");
        System.out.println(user1.getname());
        new AbstClassP3().dis1();
        new AbstClassP4().dis2();
        new AbstClassP6().dis3();

    }
}