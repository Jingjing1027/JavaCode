import java.util.Arrays;

public class 作业1220 {
    public static void main(String[] args) {
        //求数组的平均值
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
//        int[] arr = {1,2,3,4,5};
//        System.out.println( avg(arr));

        //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
//        int[] arr = {1,2,3,4,5};
//        int result = sum(arr);
//        System.out.println(result);

        //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
        // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//        int[] arr = {1,2,3};
//        int[] result = transform2(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(result));

        //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
//        int[] arr = {1,2,3,4,5};
//        printArray(arr);

        //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] transform2(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return  (double) sum / arr.length;
    }
}
