import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class circleVolume_Calculate {
    public static void main(String[] args)throws IOException {
        final double PI=3.1416;
        double r,h;
        String radii,high;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入圆柱的底面半径(单位：mm)：");
        radii=buf.readLine();
        r=Double.parseDouble(radii);
        System.out.println("请输入圆柱的高(单位：mm)：");
        high=buf.readLine();
        h=Double.parseDouble(high);
        double square=PI*r*r;
        double volume=square*h;
        System.out.println("底面半径为"+r+"mm,高为"+h+"mm的圆柱体积为：");
        System.out.printf("%.4f",volume);
        System.out.println(" mm^3");
    }
}
