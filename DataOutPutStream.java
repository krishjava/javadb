import java.io.*;
class DataOutPutStream {
public static void main(String []ss) throws IOException{
FileOutputStream fs=new FileOutputStream("abc.txt");
DataOutputStream ds=new DataOutputStream(fs);
ds.writeChar(99);

FileInputStream fin=new FileInputStream ("abc.txt");
DataInputStream di=new DataInputStream (fin);
for(int i=0 ;i<2;i++){
System.out.println((char)di.readByte());
}
System.out.println("hell");

}

}