import java.util.Scanner;

public class number_Output {
public static void main(String[] args){
    System.out.println("请输入一个小数(小数点后9位以内)：");
    Scanner var=new Scanner(System.in);
    double num=var.nextDouble();
    int integer=(int)num;//通过将小数取证从而得到小数的整数部分
    double decimal=num-integer;//用小数减去其整数部分
    System.out.println("您输入的小数的整数部分为："+integer);
    System.out.printf("您输入的小数的小数部分为："+"%.9f",decimal);//为了保证精确性，只输出小数点之后的九位数字
}
}
