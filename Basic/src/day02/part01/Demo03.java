package day02.part01;
//封装
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,50};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
}
