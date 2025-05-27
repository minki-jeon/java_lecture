package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) throws Exception {
        String file = "D:\\01.private_work\\Choongang\\workspaces\\Temp\\picture001.jpg";

        // server에 파일 보내기(업로드)
        Socket socket = new Socket("192.168.0.5", 9876);

        try (socket) {
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            try (bis; fis; bos; os) {
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
