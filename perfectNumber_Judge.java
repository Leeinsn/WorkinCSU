import java.util.Scanner;

public class perfectNumber_Judge {
    public static void main(String[] args){
        System.out.println("本程序用来判断一个整数是否是完全数，请输入一个整数：");
        Scanner var=new Scanner(System.in);
        int num=var.nextInt();
        int sum=0;
        for(int i=1;i<=num-1;i++){
            if(num%i==0)sum+=i;
        }
        if(sum==num)System.out.println(num+"是完全数");
    }
}
