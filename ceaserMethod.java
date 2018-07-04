
public class ceaserMethod {

    String temp = "";
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String encr = " ";

    public String setCeaser(String plaintext, String key, String select) {
        ceaser cea = new ceaser();
        int a = convert(key);
        encr = alphabet.substring(26 - a);
        encr = encr + alphabet.substring(0, 26 - a);
        System.out.println("input the text you want to encrypt:");
        plaintext = plaintext.toUpperCase();

        for (int j = 0; j < plaintext.length(); j++) {
            int b = alphabet.indexOf(plaintext.charAt(j));
            if (b == -1) {
                temp += " ";
            } else {
                temp += encr.substring(b, b + 1);
            }
        }
        return temp;

    }

    public String Leftdecrypt(String cipherText, String key, String select) {

        String dec = " ";
        dec = dec.toUpperCase();
        System.out.println(dec);

        for (int k = 0; k < temp.length(); k++) {
            int c = encr.indexOf(temp.charAt(k));
            if (c == -1) {
                dec += " ";
            } else {
                dec += alphabet.substring(c, c + 1);
            }
        }
        return dec;
    }

    public int convert(String s) {
        return Integer.parseInt(s);

    }

}
