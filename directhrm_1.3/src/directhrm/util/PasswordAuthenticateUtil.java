/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.util;

import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.xml.bind.DatatypeConverter;

public class PasswordAuthenticateUtil 
{
    private static PasswordAuthenticateUtil instance;
    private final String encryptionAlgorithm = "PBKDF2WithHmacSHA1";
    private final int keyLength = 160;
    private final int numberOfEncryptionIterations = 1000;
    private final byte[] salt = new byte[] {12};

    public static PasswordAuthenticateUtil getInstance() 
    {
        if (instance == null)
        {
            instance = new PasswordAuthenticateUtil();
        }
        return instance;
    }

    private PasswordAuthenticateUtil() 
    {
    }
    
    public boolean authenticate(String attemptedPasswordInClearText, String savedPassword) throws Exception
    {
        String attemptedPasswordAfterEncrypt = getEncryptedPassword(attemptedPasswordInClearText);
        return savedPassword.equals(attemptedPasswordAfterEncrypt);
    }
    
    public String getEncryptedPassword(String passwordInClearText) throws Exception
    {
        KeySpec keySpec = new PBEKeySpec(passwordInClearText.toCharArray(), salt, numberOfEncryptionIterations, keyLength);
        byte[] encryptedPassword = SecretKeyFactory.getInstance(encryptionAlgorithm).generateSecret(keySpec).getEncoded();
        return convertToString(encryptedPassword);
    }
    
    private String convertToString(byte[] array)
    {
        return DatatypeConverter.printHexBinary(array);
    }
}
