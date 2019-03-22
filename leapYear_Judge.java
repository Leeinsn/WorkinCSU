import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYear_Judge {
    public static void main(String[] args)throws IOException{
        int year;
        BufferedReader ver=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("请输入一个年份：");
        str = ver.readLine();
        year = Integer.parseInt(str);
        if (year % 4 == 0) {
            if(year%100==0){
                System.out.println(year+"年 不是闰年");
            }
            else System.out.println(year+"年 是闰年");
        }
        else System.out.println(year+"年 不是闰年");
    }
}