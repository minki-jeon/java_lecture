package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App03 {
    public static void main(String[] args) throws IOException {

        // inputstream에서 사용할 파일 생성
        String fileName = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\input03.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            for (int i = 0; i < 35; i++) {
                // 35 bytes
                os.write(i);
            }
        }
        System.out.println("파일 생성 종료");

        // input stream으로 읽기
        InputStream is = new FileInputStream(fileName);
        byte[] datas = new byte[10];

        int r1 = is.read(datas);     // is.read(): 몇 byte를 읽었는지 return
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
//        Arrays.toString(datas) = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int r2 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
//        Arrays.toString(datas) = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

        int r3 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
//        Arrays.toString(datas) = [20, 21, 22, 23, 24, 25, 26, 27, 28, 29]

        int r4 = is.read(datas);
//        Arrays.toString(datas) = [30, 31, 32, 33, 34, 25, 26, 27, 28, 29]
        // 같은 참조 배열을 사용하기때문에, 뒤에 5개 인덱스는 남아있다.
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));

        int r5 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
//        Arrays.toString(datas) = [30, 31, 32, 33, 34, 25, 26, 27, 28, 29]

        System.out.println("r1 = " + r1);   // 10
        System.out.println("r2 = " + r2);   // 10
        System.out.println("r3 = " + r3);   // 10
        System.out.println("r4 = " + r4);   // 5
        System.out.println("r5 = " + r5);   // -1
    }
}
