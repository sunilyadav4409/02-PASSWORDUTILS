package in.ashokit;
import in.ashokit.password.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PasswordEncrypt pe=new PasswordEncrypt();
    	String encryptedString =pe.encrypt("sunil");
    	System.out.println(encryptedString);
    	String decryptedString=pe.decrypt(encryptedString);
    	System.out.println(decryptedString);
         }
}
