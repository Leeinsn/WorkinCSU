/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
abstract class Animal{
    protected String name;
}
interface Flyable{
    void fly();
}
public class Horse extends Animal implements Flyable{
    String ability;
    @Override
    public void fly() {
        ability="是一只会飞的飞马！";
    }
    public void named(String name){
        super.name=name;
    }
    public static void main(String[] args){
        Horse littleHorse=new Horse();
        littleHorse.named("小马嘟嘟");
        littleHorse.fly();
        System.out.println(littleHorse.name+","+littleHorse.ability);
    }
}
