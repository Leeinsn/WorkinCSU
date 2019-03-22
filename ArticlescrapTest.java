/**
 * Author: samsung
 * Date: 03/13/2019
 * Email: sn_leeho@foxmail.com
 **/
interface Pen{
    String getType();
}
class Pencil implements Pen{
    @Override
    public String getType() {
       String penType="铅笔";             //定义笔的类型
       return penType;                      //设置返回值
    }
}
class FountainPen implements Pen{
    @Override
    public String getType() {
        String penType="钢笔";                  //定义笔的类型
        return penType;                      //返回值的设置
    }
}
interface Paper{
    String getSize();                       //定义一个抽象方法
}
class A4paper implements Paper{
    @Override
    public String getSize() {               //抽象方法的实现
        String paperSize="A4纸";
        return paperSize;
    }
}
class B5paper implements Paper{
    @Override
    public String getSize() {
        String paperSize="B5纸";
        return paperSize;
    }
}
class Articlescrap{
    private String penType;
    private String paperSize;                      //Articlescrap中的两个成员变量
    public void write(){
        System.out.println("用"+penType+"配合"+paperSize+"纸写文章");
    }
}
public class ArticlescrapTest {
    public static void main(String[] args){
        Pen penSelect1=new Pencil();
        penSelect1.getType();
        Paper paperSelect1=new A4paper();
        paperSelect1.getSize();
        System.out.println("用"+penSelect1.getType()+"配合"+paperSelect1.getSize()+"写小说！");
        Pen penSelect2=new FountainPen();
        penSelect2.getType();
        Paper paperSelect2=new B5paper();
        paperSelect2.getSize();
        System.out.println("用"+penSelect2.getType()+"配合"+paperSelect2.getSize()+"写小说！");
    }
}
