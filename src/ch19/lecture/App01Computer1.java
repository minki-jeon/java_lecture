package ch19.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Computer1 {
    public static void main(String[] args) throws Exception {
        // 1번 컴퓨터에서 2번 컴퓨터로 "hello" 메시지 보내기 (1번컴퓨터에서 2번컴퓨터로 입력시키기)

        // - 1번 컴퓨터 (Server) : 연결 대기
        ServerSocket serverSocket = new ServerSocket(9876);     // Set Port Number
        Socket socket = serverSocket.accept();

        try (socket; serverSocket) {
            //        OutputStream os = new OutputStream(null);   // Byte 출력
            OutputStream os = socket.getOutputStream();   // Byte 출력
            OutputStreamWriter osw = new OutputStreamWriter(os);    // 문자 출력
            BufferedWriter bw = new BufferedWriter(osw);    // 보조스트림

            try (bw; osw; os) {
                bw.write("hello");
                bw.flush();
            }
        }

    }
}
