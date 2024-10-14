package Chapter_13;

import java.io.*;

public class DataOutputStreamTestWithEOF {
    public static void main(String[] args) {
        //create a file and write into the file
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {
            dos.writeUTF("Md. Alamin");
            dos.writeInt(27);
            dos.writeUTF("Md. Rakib");
            dos.writeInt(25);
            dos.writeUTF("Md. Rahim");
            dos.writeInt(27);
            dos.writeUTF("Md. Karim");
            dos.writeInt(32);
            dos.writeUTF("Md. Sohan");
            dos.writeInt(17);
            dos.writeUTF("Md. Borhan");
            dos.writeInt(33);

        }catch(IOException e) {
            e.printStackTrace();
        }

        //read from data.txt file using Data input stream class
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            while (true){
                System.out.println(dis.readUTF() + " " + dis.readInt());

            }
        }catch (EOFException e) {
            System.out.println("All file read successfully!!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
