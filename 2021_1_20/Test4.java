import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {



        //4. 输入输出
        //Scanner
        //1.先创建一个Scanner对象
        //2.使用import语句导入这个Scanner类
        //3.使用scanner.nextxxx()方法读取数据
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你的姓名：");
//        String name = scanner.nextLine();
//        System.out.println("请输入你的年龄：");
//        int age = scanner.nextInt();
//        System.out.println("请输入你的工资：");
//        float salary = scanner.nextFloat();
//        System.out.println("你的信息如下：");
//        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary);
//        scanner.close();

        //需要用户输入若干个整数，求和
        int sum = 0;
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println("输入的整数结果为："+num);
            sum += num;
        }
        //CTRL+d结束
        System.out.println(sum);

        //3.循环结构
        //3.1 while循环
        // 打印 1 - 10 的数字
//        int num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            num++;
//        }

        //计算 1 - 100 的和
//        int num = 1;
//        int sum = 0;
//        while (num <= 100){
//            sum +=num;
//            num++;
//        }
//        System.out.println(sum);

        //计算 5 的阶乘
//        int num = 1;
//        int sum = 1;
//        while (num <= 5) {
//            sum *= num;
//            num++;
//        }
//        System.out.println(sum);

        //计算 1! + 2! + 3! + 4! + 5!
//        int num = 1;
//        int sum = 0;
//        //外层循环用于求和
//        while (num <= 5){
//            //内层循环用于求num的阶乘
//            int factorResult = 1;
//            int i = 1;
//            while (i <= num){
//                factorResult *= i;
//                i++;
//            }
//            sum += factorResult;
//            num++;
//        }
//        System.out.println(sum);

        //3.2 break让循环提前结束
        //找到 100 - 200 中第一个 3 的倍数
//        int num = 100;
//        while (num <= 200) {
//            if (num %3 ==0){
//                System.out.println("第一个3的倍数为：" + num);
//                break;
//            }
//            num++;
//        }

        //3.3 continue跳过这次循环，进入下一次循环
        //找到 100 - 200 中所有 3 的倍数
//        int num = 100;
//        while (num <= 200) {
//            if (num % 3 != 0) {
//                num++;
//                continue;
//            }
//            System.out.println("所有3的倍数为：" + num);
//            num++;
//        }

        //3.4 for循环
        //打印 1 - 10 的数字
//        for (int num = 1;num <=10;num++){
//            System.out.print(num + " ");
//        }

        // 计算 1 - 100 的和
//        int result = 0;
//        for (int num = 1; num <= 100; num++){
//            result +=num;
//        }
//        System.out.println(result);

        //计算 5 的阶乘
//        int result = 1;
//        for (int num = 1; num <= 5; num++){
//            result *= num;
//        }
//        System.out.println(result);

        // 计算 1! + 2! + 3! + 4! + 5!
//        int result = 0;
//        for (int num = 1; num <= 5; num++){
//            int factorresult = 1;
//            for (int i = 1; i <= num; i++){
//                factorresult *= i;
//            }
//            result += factorresult;
//        }
//        System.out.println(result);

        //3.5 do while
        //打印1-10
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        }while (num <= 10);


        //2.分支语句
        //if语句
//        int num = 10;
//        if(num > 20)
//        {
//            System.out.println("num");
//        }

//        int score = 90;
//        if(score >= 90){
//            System.out.println("优秀");
//        }else if(score >=80){
//            System.out.println("良好");
//        }else if(score >= 70){
//            System.out.println("中等");
//        }else if(score >= 60){
//            System.out.println("及格");
//        }else{
//            System.out.println("不及格");
//        }

        // 判定一个数字是奇数还是偶数
//        int num = 20;
//        if(num % 2 ！= 0){
//            System.out.println("奇数");
//        } else {
//            System.out.println("偶数");
//        }

        //判定一个数字是正数还是负数
//        int num = 10;
//        if(num > 0){
//            System.out.println("正数");
//        } else if(num < 0){
//            System.out.println("负数");
//        } else{
//            System.out.println("num为0");
//        }

        //判定某一年份是否是闰年
//        int year = 1290;
//        if(year % 100 == 0){
//            //1.世纪闰年（能被100和400整除）
//            if(year % 400 == 0){
//                System.out.println("是闰年");
//            } else {
//                System.out.println("不是闰年");
//            }
//        }else {
//            //2.普通闰年（不能被100整除，能被4整除）
//            if(year % 4 == 0){
//                System.out.println("是闰年");
//            } else {
//                System.out.println("不是闰年");
//        }

        //switch语句
        //根据 day 的值输出星期
//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期天");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }



        //1.顺序结构
//        System.out.println("aaa");
//        System.out.println("bbb");
//        System.out.println("ccc");
    }
}
