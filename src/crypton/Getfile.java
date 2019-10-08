package crypton;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Random;
public class Getfile {
    public static byte[] IV;
    public static byte[] Key;
    public static byte[] plaintext;
        public static byte[] ciphertext;
    Primitives encrypt,decrpt;
    //Getting the file
    public byte[] GetFile(String filename) throws FileNotFoundException, IOException{
        File MyFile= new File(filename);
        FileInputStream FileData= new FileInputStream(MyFile);
        byte[] Temp=new byte[(int)MyFile.length()];
        FileData.read(Temp);
        FileData.close();
        return Temp;
        
    }
    //the output 
    public void Output(byte[] x)    {
        for(int i=0;i<x.length;i++){
            System.out.printf("%02X ", x[i]);
        }
    }
    //generating the key
    public void Generatekey(int keysize,String password,String filepath) throws IOException{
     Random Rand=new Random();
     IV=new byte[keysize];
     Key=new  byte[keysize];
     Rand.nextBytes(IV);
     Key=encrypt.XORFunction(IV, password.getBytes());
        writefile(IV, filepath+".key");
    
    }
    //write file
    public void writefile(byte[] data,String filename) throws FileNotFoundException, IOException{
        File outfile= new File(filename);
        FileOutputStream outdata=new FileOutputStream(outfile);
        outdata.write(data);
        outdata.close();
    }
    //Encryption function
    public void Encrypt(int t, String password, String plain) throws IOException
    {  
        plaintext=GetFile(plain);
        Generatekey(1024, password, plain);    
       encrypt =new Primitives(); 
        writefile(encrypt.passvalue(t, plaintext,Key),plain+".crypt");      
        
    
    }
    //Decryption function
    public void Decrypt(int t, String password, String plain) throws IOException
    {
      ciphertext=GetFile(plain);
    IV=GetFile(plain.substring(0,plain.lastIndexOf(".crypt"))+".key");
   Key=decrpt.XORFunction(IV, password.getBytes());
      decrpt=new Primitives();     
      writefile(decrpt.decpass(t, ciphertext,Key),plain+".plain");      
    
    }
 
}
