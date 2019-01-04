//MOISES BARBERA RAMOS 
//07-02-2017 LIVERPOOL, UK

package ENCRYPTION PROJECT;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        System.out.println('Welcome to your personal encryption system');
        System.out.println('Press : (0) to Encrypt\t(1) to Decrypt');

        InputStream input = System.in;
        BufferReader reader = new BufferReader(new InputStreamReade(input));
        String line;

        try {
            while(!(line = reader.readline()).equals('END')){
                int choice = -1;

                try {
                    choice = Integer.parseInt(libe);
                } catch (NumberFormatException e) {
                      System.out.println("Error: this text can't be formated into a number");
                }
                if (choice == 0) {
                    System.out.println("Ready to encrypt!\n");
                    System.out.println("Enter message to encrypt.");

                    String message = reader.readLine();
                    new Encryption(message);

                } else if (choice == 1) {
                    System.out.println("Ready to decrypt!\n");
                    System.out.println("Enter code to decrypt.");

                    String code = reader.readLine();
                    new Decryption(code);

                } else {
                    System.out.println("Incorrect option");
                }
                 System.out.println("Press 0) to Encrypt\t1) to Decrypt");
            }
        } catch (IOException e) {
            System.out.println("Could not read from the stream.");
        }
    }
}
