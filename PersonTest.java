/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
abstract class Person{
    protected String name;
    protected String sex;
    protected int age;
    protected String ability1;
    protected String ability2;
    abstract void property(String name,String sex,int age);
    abstract void show();//定义了两个抽象方法，一个给name，sex，age赋值，一个用来打印
}
interface Sayable{
    void say();
}
interface Hearable{
    void hear();
}
interface Eatable{
    void eat();//定义了三个能力的接口
}
class Deaf extends Person implements Sayable,Eatable{//实现了类对Person的继承和对其中两个接口的实现
    void property(String name,String sex,int age){
        super.name=name;
        super.sex=sex;
        super.age=age;
    }
    @Override
    void show() {
        System.out.println("大家好，我是一个"+name+"!");
        System.out.println("我有"+super.ability1+"的能力!");
        System.out.println("我有"+super.ability2+"的能力!");
    }

    @Override
    public void say() {
        super.ability1="说";
    }

    @Override
    public void eat() {
        super.ability2="吃";
    }
}
class Dumb extends Person implements Hearable,Eatable{
    void property(String name,String sex,int age){
        super.name=name;
        super.sex=sex;
        super.age=age;
    }
    @Override
    void show() {
        System.out.println("大家好，我是一个"+name+"!");
        System.out.println("我有"+super.ability1+"的能力!");
        System.out.println("我有"+super.ability2+"的能力!");
    }

    @Override
    public void hear() {
        super.ability1="听";
    }

    @Override
    public void eat() {
        super.ability2="吃";
    }
}
public class PersonTest {
    public static void main(String[] args){
        Dumb person2=new Dumb();
        person2.property("哑巴","女",31);
        person2.hear();
        person2.eat();
        person2.show();
        Deaf person1=new Deaf();
        person1.property("聋子","男",45);
        person1.say();
        person1.eat();
        person1.show();

    }
}
