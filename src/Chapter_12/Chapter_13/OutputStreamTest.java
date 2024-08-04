package Chapter_12.Chapter_13;

import java.io.*;

public class OutputStreamTest {

    public static void main(String[] args) {
        //creating a file data.dat and write inside the data.dat using dos
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))){
            dos.writeUTF("Md. Alamin ");
            dos.writeInt(17);
            dos.writeUTF("Md. Arafat ");
            dos.writeInt( 13);
            dos.writeUTF("Abu Sayeed ");
            dos.write(36);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        //reading from data.dat file using dis
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))){
            System.out.println(dis.readUTF() + " " + dis.readInt());
            System.out.println(dis.readUTF() + " " + dis.readInt());
            System.out.println(dis.readUTF() + " " + dis.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
