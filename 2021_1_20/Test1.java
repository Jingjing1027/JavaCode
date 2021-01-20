import java.util.Random;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
//        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
//        System.out.println("包装类：java.lang.Byte");
//        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
//        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);

//        short a =128;
//        byte b =(byte) a;
//        System.out.println(a);
//        System.out.println(b);

//        int sum=0;
//        int num=1;
//        while(num<=5) {
//            int result = 1;
//            int n = 1;
//            while (n <= num) {
//                result *= n;
//                n++;
//            }
//            sum+=result;
//            num++;
//        }
//        System.out.println("sum = "+sum);
//        for(int num=0;num<=10;num++){
//            System.out.println(num);

        //数字9 出现的次数
        int i=1;
        int count=0;
        for(i=1;i<=100;i++){
            if(i%10==9){
                count++;
                }
            if(i/10==9){
                    count++;
            }
        }
        System.out.println(count);

//        Scanner sc=new Scanner(System.in);
//        int sum=0;
//        while(sc.hasNext()){
//            int num=sc.nextInt();
//            sum+=num;
//        }
//        System.out.println(sum);

        //猜数字
        //1.先生成一个【1，100】的整数
//        Random random=new Random();
//        //[0-99]+1=>[1,100]
//        int toGuess=random.nextInt(100)+1;
//        //3.循环的其实用户来输入数字
//        Scanner scanner=new Scanner(System.in);
//        while (true){
//            System.out.println("其输入要猜的数字：");
//            int num=scanner.nextInt();
//            //3.进行判定
//            if(num<toGuess){
//                System.out.println("低了");
//            }else if(num>toGuess){
//                System.out.println("高了");
//            }else{
//                System.out.println("对了");
//                break;
//            }
//        }
    }
}
