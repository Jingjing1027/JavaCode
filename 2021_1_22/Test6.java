import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        //数组创建
        //1.数组的元素通过{}来指定
//        int[] arr1 = new int[]{1,2,3,4};
//        //2.数组的元素通过{}来指定
//        int[] arr2 = {1,2,3,4};
//        //3.数组中的每个元素都被初始化成了0
//        //用于指定长度
//        int[] arr3 = new int[4];

        //数组长度
//        System.out.println(arr1.length);

        //获取数组元素
//        System.out.println(arr1[1]);

//        int[] arr = {1,2,3,4};
        //遍历，按照一定顺序，把一个数组/集合中的每个元素都访问一遍
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //for each
//        for (int x : arr) {
//            System.out.println(x);
//        }

        //
//        int[] arr = {1,2,3,4};
//        int[] result = transform(arr);
//        printArray(result);
//        System.out.println("=========");
//        printArray(arr);


        //数组传参相当于”赋值“
//        int[] a = arr;

        //查看数组的内容，希望可以更方便的观察
        //就可以把数组内容按照一定的格式组织成一个字符串
//        int[] arr = {1,2,3,4};
//        int[] result = transform(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arrayToString(result));
//        System.out.println(arrayToString(arr));

        //数组练习
        //数组拷贝
//        int[] arr = {1,2,3,4};
////        int[] result = copyOf(arr);
//        int[] result = Arrays.copyOf(arr,arr.length)
//        //拷贝
//        System.out.println(Arrays.toString(result));
//        result[0] = 100;
//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(arr));

        //找数组的最大元素
//        int[] arr = {1,6,7,2,4};
//        System.out.println(max(arr));

        //求数组中元素的平均值
//        int[] arr = {2,3,5,4,3};
//        System.out.println(avg(arr));

        //查找数组中指定元素（顺序查找）
//        int[] arr = {1,3,5,7,3,2};
//        int pos = search(arr,3);
//        System.out.println(pos);

        //查找数组中指定元素（二分查找）
//        int[] arr = {1,2,3,5,6,8,9};
//        int pos = binarySearch(arr,8);
//        System.out.println(pos);

        //检查数组的有序性
//        int[] arr = {1,3,5,10,5,6};
//        System.out.println(isSorted(arr));

        //数组排序（冒泡排序）
        int[] arr = {9,5,4,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void bubbleSort(int[] arr) {
        //从后往前遍历
        //外层循环控制遍历次数
        //已排序区间【0，bound）
        //待排序区间【bound，length）
        for (int bound = 0; bound < arr.length; bound++) {  //bound范围
            //内层循环控制比较交换
            for (int cur = arr.length - 1; cur > bound; cur--) {   //cur=4
                if (arr[cur - 1] > arr[cur]) {  //前面大于后面
                    //不符合要求
                    int tmp = arr[cur];
                    arr[cur] = arr[cur - 1];
                    arr[cur - 1] = tmp;
                }
            }
        }
        return;
    }

    //
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                //找反例
                return false;
            }
        }
        return true;
    }


    private static int binarySearch(int[] arr,int toSearch) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (toSearch < arr[mid]) {
                //去左侧找
                right = mid -1;
            } else if (toSearch > arr[mid]) {
                //去右侧找
                left = mid + 1;
            } else {
                //找到了
                return mid;
            }
        }
        //没找到
        return  -1;
    }

    public static int search(int[] arr, int toSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toSearch) {
                return i;
            }
        }
        return -1;
    }

    //
    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return  (double) sum / arr.length;
    }

    //
    public static int max(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
    //
    public static int[] copyOf(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //约定打印成的格式；
    //    //[1，2，3，4]
    public static String arrayToString(int[] arr) {
        String result = "[";
//        for (int x : arr) {
//            result += (x + ",");
//        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i != arr.length - 1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }


    //
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //写一个方法，把数组中的每个元素都 * 2
    public static int[] transform(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            a[i] *= 2;
//        }

        int[] result = new int[a.length];  //new出来的对象的生命周期，是根据垃圾回收器自动判定的
        for (int i = 0; i < a.length; i++) {
            result[i] = 2 * a[i];
        }
        return result;
    }
}
