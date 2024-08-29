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
        int shift = 9;
        while(i < encrypted.length()){
            // If chart at i is anything but a letter
            if(encrypted.charAt(i) < 'A' || encrypted.charAt(i) > 'z'){
                decrypted += encrypted.charAt(i);
            }
            else{
                // Get ascii value of letter
                ascii = encrypted.charAt(i);
                // Check if upper case
                if(Character.isUpperCase(encrypted.charAt(i))){
                    // Get the actual letter
                    ascii += shift;
                    // check if ascii value is too big (bigger than Z)
                    if(ascii > 'Z'){
                        // Do this so that letter won't be 1 ascii value higher
                        ascii--;
                        // makes sure ascii value is a upper case letter, 90 = Z, 65 = A
                        ascii = ascii - 'Z' + 'A';
                    }
                }
                // If lower case
                else{
                    // Get the actual letter
                    ascii += shift;
                    // check if ascii value is too big (bigger than z)
                    if(ascii > 'z'){
                        // Do this so that letter won't be 1 ascii value higher
                        ascii--;
                        // makes sure ascii value is a lower case letter, 122 = z, 97 = a
                        ascii = ascii - 'z' + 'a';
                    }
                }
                // Convert int to char
                decrypted += (char) ascii;
            }
            i++;
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String num = "";
        int letter = 0;
        int i = 0;
        // TODO: Complete the decryptTwo() function.
        while(i < encrypted.length()){
            // If char is a space
            if(encrypted.charAt(i) == ' '){
                i++;
                // Turn num an int
                letter = Integer.parseInt(num);
                decrypted += (char) letter;
                // Reset
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
            binary = encrypted.substring(i, i + 8);
            // Convert String (byte) to String and cast it to a char
            decrypted += (char) (Integer.parseInt(binary, 2));
            i = i + 8;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.
        int i = 0;
        int ascii = 0;
        int letter = 0;
        int difference = 9919;
        while(i < encrypted.length()){
            // Turn character into ascii number
            ascii = encrypted.charAt(i);
            // Calculate from Dingbat to letter
            letter = ascii - difference;
            // Turn Ascii value into string
            decrypted += (char) letter;
            i++;
        }
        return decrypted;
    }
}
