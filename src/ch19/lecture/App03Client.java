package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class App03Client {
    public static void main(String[] args) throws Exception {
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\download001.jpg";

        // client: server 연결 시도
        Socket socket = new Socket("192.168.0.28", 9876);
//        Socket socket = new Socket("192.168.0.5", 9876);
        try (socket) {
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // InputStream으로 파일 수신 (Write)
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try (bos; fos; bis; is) {
                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }
}
