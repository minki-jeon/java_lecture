package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App06Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        // request message
        // 1번째 줄 : [METHOD] [PATH] [VERSION]
        String line1 = br.readLine();
        System.out.println(line1);
        // 2번째 줄부터 Empty-Line까지 : header
        String header = "";
        while (!(header = br.readLine()).isBlank()) {
            System.out.println(header);
        }

        // Empty-Line

        // 요청 본문 시작

        /////// 응답 ////////
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw = new PrintWriter(osw);

        String htmlCode = """
                <!doctype html>
                <html>
                    <body>
                        <h1>처음 만나는 서버 프로그래밍 ✌️</h1>
                        <p>이렇게 어려운 줄 몰랐다 </p>
                        <p>하지만 열심히 해서 꼭 취업해야지</p>
                    </body>
                </html>
                """;


        // 1번째 줄 : [VERSION] [CODE] [STATUS]
        pw.println("HTTP/1.1 200 OK");

        // 2번째 줄부터~빈줄까지
        // 응답 헤더
        pw.println("Content-Type: text/html; charset=UTF-8");
        pw.println("Content-Length: " + htmlCode.getBytes().length);

        // 빈줄
        pw.println();

        // 응답 본문
        pw.println(htmlCode);

        pw.flush();

    }
}
