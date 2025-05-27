package ch19.lecture;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App01Computer2 {
    public static void main(String[] args) throws Exception {
        // 1번 컴퓨터에서 2번 컴퓨터로 "hello" 메시지 보내기 (1번컴퓨터에서 2번컴퓨터로 입력시키기)

        // - 2번 컴퓨터 (Client) : 연결 시도
        Socket socket = new Socket("192.168.0.28", 9876);     // Input Server IP Address, Port


        try (socket) {
            //        InputStream is = new InputStream(null);                 // Byte 입력
            InputStream is = socket.getInputStream();                 // Byte 입력
            InputStreamReader isr = new InputStreamReader(is);      // 문자 입력
            BufferedReader br = new BufferedReader(isr);            // 보조스트림

            try (br; isr; is) {
                String message = br.readLine();
                System.out.println("message = " + message);     // hello
            }

        }
    }
}
