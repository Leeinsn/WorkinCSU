/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
interface Poultry{
    String getName();
    String getKind();
    String getDoing();
}
class Chicken implements Poultry{
    String name="小花";
    String doing="在吃鱼";
    String kind="猫";
    public String getName(){
     return name;
    }
    public String getKind(){
        return kind;
    }
    public String getDoing(){
        return doing;
    }
}
class Duck implements Poultry{
    String name="小林";
    String doing="在啃骨头";
    String kind="狗";
    public String getName(){
        return name;
    }
    public String getKind(){
        return kind;
    }
    public String getDoing(){
        return doing;
    }
}
public class PoultryTest {
    public static void main(String[] args){
        Poultry pou1=new Chicken();
        System.out.println(pou1.getName());
        Poultry pou2=new Duck();
        System.out.println(pou2.getName());
        System.out.println("名叫"+pou1.getName()+"的"+pou1.getKind()+","+pou1.getDoing());
        System.out.println("名叫"+pou2.getName()+"的"+pou2.getKind()+","+pou2.getDoing());
    }
}
