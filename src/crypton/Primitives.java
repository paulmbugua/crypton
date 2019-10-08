package crypton;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Primitives {
      public static byte[] IV;
    public static byte[] Key;
    public static byte[] plaintext;
    public static byte[] ciphertext;
    public static byte[] chunk1;
    public static byte[] chunk2;
    public static byte[] key1;
    public static byte[] key2;
    public static String path;
    public static int t;
      //XOR function
    public static byte[] XORFunction(byte[] Data, byte[] key){
     byte []temp=new byte[(int)Data.length];
     int pos=0;   
     for (int i=0;i<Data.length;i++){
         if(pos>key.length-1)
         {
             pos=0;
         }
         temp[i]=(byte)(Data[i]^key[pos]);
             pos++;
     } 
     return temp;
    }
       //Transpose function  
    public static byte[] transpose(int t, byte[] filebyte) throws IOException{    byte [] newarray= new byte[filebyte.length];
        int j=t;
        for(int p=0;p<filebyte.length;p++){
            if(j>=filebyte.length)
            {
                j=0;
            }
            newarray[j]=filebyte[p];
            j++;
        }
        return newarray;
    }
     //reverse transpose
    public static byte[] reversetranspose(int t,byte[] filebyte){
         byte [] newarray1= new byte[filebyte.length];
       int j2=(filebyte.length-1)-t;
        for(int p=filebyte.length-1;p>=0;p--){
            if(j2<0)
            {
                j2=filebyte.length-1;
            }
            newarray1[j2]=filebyte[p];
            j2--;
        }
        return newarray1;
    }
    //hashing algorithm
    public static String hashme(String input,String t) throws NoSuchAlgorithmException{
     MessageDigest digest= MessageDigest.getInstance(t); 
       byte[] hash= digest.digest(input.getBytes());
       BigInteger number =new BigInteger(1,hash);
       return (number.toString(16));
    }
    //Reverse the bytes
    public static byte[]reversebytes(byte [] inputbyte) throws FileNotFoundException, IOException{
        byte[] temp= new byte[(inputbyte.length)];
        int position=temp.length-1;
            for(int i=0;i<inputbyte.length;i++){
                temp[position]=inputbyte[i];
                position--;
            }
       return temp;
    }
     //function to split the key
    public static void splitkey() throws IOException{
       int pos=Key.length; 
     key1=new byte[(pos+1)/2];
      key2=new byte[(pos-key1.length)];
       for (int i=0; i<pos;i++){
           if (i<key1.length)
           {
               key1[i]=Key[i];
           }
           else
           {
               key2[i-key1.length]=Key[i];
           }
           
       }
            
    }
     //combinign the key
    public void concatkey(){
        int size=(key1.length) + (key2.length);
        byte[] arraycombined=new byte [size];
        for(int i=0;i<arraycombined.length;i++){
          if (i<key1.length){
              arraycombined[i]=key1[i];
          }else
          {
              arraycombined[i]=key2[i-key1.length];
          }
        }
        
    
    }
    //function to split the bytes
    public static void splitbytes(byte [] inputbytes) throws IOException{
        plaintext=inputbytes;
       int pos=inputbytes.length; 
      chunk1=new byte[(pos+1)/2];
      chunk2=new byte[(pos-chunk1.length)];
       for (int i=0; i<pos;i++){
           if (i<chunk1.length)
           {
               chunk1[i]=inputbytes[i];
           }
           else
           {
               chunk2[i-chunk1.length]=inputbytes[i];
           }
           
       }
              
    }
    //combinign the blocks
    public static byte[] concatination(){
        int size=(chunk1.length) + (chunk2.length);
        byte[] arraycombined=new byte [size];
        for(int i=0;i<arraycombined.length;i++){
          if (i<chunk1.length){
              arraycombined[i]=chunk1[i];
          }else
          {
              arraycombined[i]=chunk2[i-chunk1.length];
          }
        }
    return arraycombined;
    }
    public static byte [] passvalue(int x,byte[] y,byte[] z) throws IOException{
        t=x;
        plaintext=y;
        Key=z;
        splitbytes(plaintext);
        chunk1=reversebytes(chunk1);
        chunk2=reversebytes(chunk2);
        plaintext=concatination();
        plaintext=XORFunction(plaintext, Key);
        plaintext=transpose(t, plaintext);
        plaintext=XORFunction(plaintext, Key);
        splitkey();
        splitbytes(plaintext);
        chunk1=XORFunction(chunk1, key1);
        chunk2=XORFunction(chunk2, key2);
        plaintext=concatination();
        ciphertext=XORFunction(plaintext, Key);
       return ciphertext;        
        
    }
    public static byte[] decpass(int x, byte[] y,byte [] z) throws IOException{
        t=x;
        ciphertext=y;
        Key=z;
        plaintext=XORFunction(ciphertext, Key);
       splitbytes(plaintext);
       splitkey();
        chunk1=XORFunction(chunk1, key1);
        chunk2=XORFunction(chunk2, key2);
        plaintext=concatination();
        plaintext=XORFunction(plaintext, Key);
        plaintext=reversetranspose(t, plaintext);
        plaintext=XORFunction(plaintext, Key);
        splitbytes(plaintext);
        chunk1=reversebytes(chunk1);
        chunk2=reversebytes(chunk2);
        plaintext=concatination();
        
        return plaintext;
    }
    
}
