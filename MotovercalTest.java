/**
 * Author: samsung
 * Date: 03/12/2019
 * Email: sn_leeho@foxmail.com
 **/
abstract class Motovercal{
    protected String no;
    protected String type;
    protected int price;
    public void property(){
    }
    abstract public void show();
}
class Car extends Motovercal{
    private String color;
    public void property(String no,String type,int price,String color){
        super.no=no;
        super.price=price;
        super.type=type;
        this.color=color;
    }
    @Override
    public void show() {
        System.out.println("本车车牌号为："+this.no+",类型为："+this.type+",价格为："+this.price+",颜色为："+this.color);
    }
}
class Bus extends Motovercal{
    private int seatCount;
    public void property(String no,String type,int price,int seatCount) {
        super.no=no;
        super.type=type;
        super.price=price;
        this.seatCount=seatCount;
    }

    @Override
    public void show() {
        System.out.println("本车车牌号为："+this.no+",类型为："+this.type+",价格为："+this.price+",拥有"+this.seatCount+"个座位");
    }

}
public class MotovercalTest {
    public static void main(String[] args){
        Car jeep=new Car();
        jeep.property("A00001","jeep",200000,"绿色");
        jeep.show();
        Bus Jin=new Bus();
        Jin.property("A00002","金龙",250000,30);
        Jin.show();
    }
}
