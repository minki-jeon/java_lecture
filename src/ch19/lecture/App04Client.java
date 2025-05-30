package ch19.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class App04Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.0.5", 9876)) {
//        try (Socket socket = new Socket("192.168.0.28", 9876)) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            Scanner sc = new Scanner(System.in);

            try (pw; bw; osw; os) {
//                pw.println("안녕하세요. 저는 Client 입니다.");
//                pw.flush();
                while (true) {
                    System.out.print("입력>> ");
                    pw.println(sc.nextLine());
                    pw.flush();
                }
            }
        } catch (Exception e) {
        }
    }
}
