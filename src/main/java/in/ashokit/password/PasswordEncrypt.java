package in.ashokit.password;

import java.beans.Encoder;
import java.util.Base64;
import java.util.Base64.Decoder;
 public class PasswordEncrypt {
     public String encrypt(String text)
     {
    	java.util.Base64.Encoder encoder= Base64.getEncoder();
    	String encodedString=encoder.encodeToString(text.getBytes());
    	return encodedString;
     }
     public String decrypt(String encryptedtext)
     {
    	 Decoder decoder=Base64.getDecoder();
    	 byte[] decode=decoder.decode(encryptedtext);
    	 return new String(decode);
    	 
    	 }

}
