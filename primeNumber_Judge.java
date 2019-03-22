import java.util.Scanner;
public class primeNumber_Judge {
    public static void main(String[] args){
        int num;
        System.out.println("请输入一个数");
        Scanner reader=new Scanner(System.in);
        num=reader.nextInt();
        while(num<=0){
            System.out.println("您输入的数有误，请重新输入");
            num=reader.nextInt();
        }
        if(num==2)System.out.println(num+"是质数");
        else{
            int i;
            for(i=2;i<=num-1;++i){
                if(num%i==0) {
                    System.out.println(num + "不是质数");
                    break;
                }
            }
            if(i==num)System.out.println(num+"是质数");
        }
    }
}
