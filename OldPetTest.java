/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
abstract class Pet2{
    String name;
    int health;
    int love;
    public void property(String x,int y,int love){
        name=x;
        health=y;
        this.love=love;
    }
    public void show(){
        System.out.print("名叫:");
    }
    abstract void eat();
}
class Dog extends Pet2{
    String strain;
    @Override
    void eat() {
        System.out.println("跑回来啃骨头！");
    }
}
class Penguin extends Pet2{
    String sex;
    @Override
    void eat() {
        System.out.println("跑回来吃鱼！");
    }
}
public class OldPetTest {
    public static void main(String[] args){
        Pet2 Xiaohua=new Dog();
        Xiaohua.property("小花的小狗，是一只",100,20);
        ((Dog) Xiaohua).strain="拉布拉多犬";
        Xiaohua.show();
        System.out.print(Xiaohua.name+""+((Dog) Xiaohua).strain+"健康值为"+Xiaohua.health+",亲密度为"+Xiaohua.love+",");
        Xiaohua.eat();
        Pet2 QQ=new Penguin();
        QQ.property("QQ的企鹅，是个",90,80);
        ((Penguin) QQ).sex="美女";
        QQ.show();
        System.out.print(QQ.name+""+((Penguin) QQ).sex+"，健康值为"+QQ.health+",亲密度为"+QQ.love+",");
        QQ.eat();
    }
}
