/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptOne() function.
        int i = 0;
        int ascii = 0;
        while(i < encrypted.length()){
            if((int) encrypted.charAt(i) < 65 || (int) encrypted.charAt(i) > 122){
                decrypted += encrypted.charAt(i);
            }
            else{
                // get ascii value
                ascii = (int) encrypted.charAt(i) + 9;
                // check if upper case
                if(Character.isUpperCase(encrypted.charAt(i))){
                    // check if ascii value is too big
                    if(ascii > 90){
                        ascii = (ascii - 90) + 65;
                    }
                }
                // If lower case
                else{
                    // check if ascii value is too big
                    if(ascii > 122){
                        ascii = (ascii - 122) + 97;
                    }
                }
                decrypted += String.valueOf(ascii);
            }
            i++;
        }


        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String num = "";
        String letter = "";
        int i = 0;
        // TODO: Complete the decryptTwo() function.
        while(i < encrypted.length()){
            if(encrypted.charAt(i) == ' '){
                i++;
                letter = String.valueOf(Integer.parseInt(num));
                decrypted += letter;
                letter = "";
                num = "";
            }
            num += encrypted.charAt(i);
            i++;
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        int i = 0;
        String binary = "";
        // TODO: Complete the decryptThree() function.
        while(i < encrypted.length()){
            // Grab each byte
            binary = encrypted.substring(i, i + 7);
            decrypted += Integer.parseInt(binary, 2);
            i = i + 8;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
