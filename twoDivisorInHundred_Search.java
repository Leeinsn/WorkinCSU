import java.util.Scanner;

public class twoDivisorInHundred_Search {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        System.out.println("请输入第1个除数：");
        int div1=var.nextInt();
        System.out.println("请输入第2个除数：");
        int div2=var.nextInt();
        int num,a,b;
        for(num=1;num<=100;++num)
        {

            a=num%div1;
            b=num%div2;
            if(a==0&&b==0)System.out.println(num);
        }
    }
}
