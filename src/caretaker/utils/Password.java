package caretaker.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {
    private String pass = "";

    public Password(String pass) {
        this.pass = pass;
    }
    
    public String hashPassword(){
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(this.pass.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hash = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            
        }
        return hash;
    }
}
