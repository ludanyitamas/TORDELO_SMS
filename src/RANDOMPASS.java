
import java.security.SecureRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ludanyi.tamas
 */
public class RANDOMPASS {

    private static SecureRandom random = new SecureRandom();
    private String ALPHA_CAPS = "ABCDEFGHJKLMNPQRSTUVWXYZ";
    private String ALPHA = "abcdefghjkmnopqrstuvwxyz";
    private String NUMERIC = "0123456789";
    private String SPECIAL_CHARS = "!@#$%^&*_=+-/";
    
    String merge = "";

    public String RandomPASS(int len, boolean nagyB, boolean kisB, boolean specC, boolean szam) {
        String result ="";
        if (nagyB == true && kisB == false && specC == false && szam == false) {
            merge = ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (kisB == true && nagyB == false && specC == false && szam == false) {
            merge = ALPHA;
            result = genaralo(merge, result, len);
        } else if (specC == true && kisB == false && nagyB == false && szam == false) {
            merge = SPECIAL_CHARS;
            result = genaralo(merge, result, len);
        } else if (szam == true && kisB == false && specC == false && nagyB == false) {
            merge = NUMERIC;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && kisB == true && specC == false && szam == false) {
            merge = ALPHA + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && specC == true && kisB == false && szam == false) {
            merge = SPECIAL_CHARS + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && szam == true && specC == false && kisB == false) {
            merge = NUMERIC + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (kisB == true && szam == true && specC == false && nagyB == false) {
            merge = NUMERIC + ALPHA;
            result = genaralo(merge, result, len);
        } else if (kisB == true && specC == true && szam == false && nagyB == false) {
            merge = SPECIAL_CHARS + ALPHA;
            result = genaralo(merge, result, len);
        } else if (szam == true && specC == true && kisB == false && nagyB == false) {
            merge = SPECIAL_CHARS + NUMERIC;
            result = genaralo(merge, result, len);
        } else if (kisB == true && specC == true && szam == true && nagyB == false) {
            merge = SPECIAL_CHARS + NUMERIC + ALPHA;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && specC == true && szam == true && kisB == false) {
            merge = SPECIAL_CHARS + NUMERIC + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && kisB == true && szam == true && specC == false) {
            merge = NUMERIC + ALPHA + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (nagyB == true && kisB == true && specC == true && szam == false) {
            merge = SPECIAL_CHARS + ALPHA + ALPHA_CAPS;
            result = genaralo(merge, result, len);
        } else if (specC == true && kisB == true && nagyB == true && szam == true) {
            merge = SPECIAL_CHARS + NUMERIC + ALPHA_CAPS + ALPHA;
            result = genaralo(merge, result, len);
        }

        return result;
 
    }
    
    
    public String genaralo(String merge , String result, int len){
        for (int i = 0; i < len; i++) {
                int index = random.nextInt(merge.length());
                result += merge.charAt(index);
            }
        return result;
    }
   

}
