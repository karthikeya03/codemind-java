import java.text.DecimalFormat;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=(a+b)/2;
        DecimalFormat df = new DecimalFormat("#.0000");
        String formattedArea = df.format(c);
        System.out.println(formattedArea);
    }
}