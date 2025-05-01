package ch05.lecture;

public class C04Array {
    public static void main(String[] args) {
        // 초기값 안넣으면 0, false, null
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // 배열 생성시 초기값 적용
        int[] b = new int[]{99, 55, 22};
        for (int i = 0; i < 3; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        double[] c = new double[]{3.14, 9, 12, 7.1234, 6.4321};
        for (int i = 0; i < 4; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        String[] d = new String[]{"hi", "hello", "안녕", "곤니찌와", "hola"};
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }
    }
}
