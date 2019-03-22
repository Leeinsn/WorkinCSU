import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Author: samsung
 * Date: 03/10/2019
 * Email: sn_leeho@foxmail.com
 **/
public class Delete_s {
    public static void main(String[] args)throws IOException {
        System.out.println("请输入一个字符串");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        System.out.println("请输入一个字符");
        String str2=buf.readLine();
        if(str2.length()==1){
            str=str.replaceAll(str2,"");
            System.out.print(str);
        }
        else{
            System.out.println("您输入的不是字符");
        }

    }
}



