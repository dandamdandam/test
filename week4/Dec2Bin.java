import java.util.Scanner;
/**
*입력받은 10진수를 2진수로 변환하는 프로그램이다.
*사용자는 자연수만을 입력한다고 가정한다.
*
*@author 정다연 
*/
public class Dec2Bin{
    public static void main(String args[]){
        System.out.println("자연수 하나를 입력하시오: ");
        Scanner input=new Scanner(System.in);
        int dec=input.nextInt();
        String bin= "";

        while(dec>1){
            bin=dec%2+bin;
            dec=dec/2;
        }
        bin=dec+bin;
        System.out.print(bin);
        input.close();
    }
}