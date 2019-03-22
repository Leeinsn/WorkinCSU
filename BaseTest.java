/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
class Base{
    public String name="张三";
}
class Child extends Base{
    public String name="李四";
}
public class BaseTest {
    public static void main(String[] args){
        Base person=new Child();
        System.out.println("获得子类的name属性值:"+person.name);
    }
}
