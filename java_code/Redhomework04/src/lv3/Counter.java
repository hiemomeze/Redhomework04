package lv01;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        char []m={'+','-','*','/'};
        System.out.println("*********计算开始********");
        Scanner r=new Scanner(System.in);//String name= scanner.nextLine();
        System.out.println("输入字符串一：" );
        String  r1=r.nextLine();
        char a='+';
        try{
        for (char c:m){
            for (int i = 0; i < r1.length(); i++) {
                if (r1.charAt(i)==c){
                   a=c;
                    break;
                }
            }
        }
        switch (a){
            case'+':
                float num1 = Float.parseFloat(r1.split("\\+")[0]);
                float num2 = Float.parseFloat(r1.split("\\+")[1]);
                System.out.println("结果是：" + (num1 + num2));
                break;
                case'*':
                    float num3 = Float.parseFloat(r1.split("\\*")[0]);
                    float num4 = Float.parseFloat(r1.split("\\*")[1]);
                    System.out.println("结果是：" + (num3 * num4));
                    break;
            case'-':
                float num5 = Float.parseFloat(r1.split("-")[0]);
                float num6 = Float.parseFloat(r1.split("-")[1]);
                System.out.println("结果是：" + (num5 - num6));
                break;
            case'/':
                float num7 = Float.parseFloat(r1.split("/")[0]);
                float num8 = Float.parseFloat(r1.split("/")[1]);
                System.out.println("结果是：" + (num7 /num8));
                break;
            }
        }catch (ArithmeticException e){
            System.out.println("出错了哟");
        }

    }
}
