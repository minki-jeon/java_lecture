package ch05.sec03;

public class ReferenceVariableCompareExample {
    //* Reference : [Book. 이것이 자바다] p.150
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        // 참조값 비교
        System.out.println(arr1 == arr2);   // false
        System.out.println(arr3 == arr2);   // true
    }
}
