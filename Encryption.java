package ENCRYPTION PROJECT;

import java.util.Random;

public class Encryption {

    private int mRows = 3;
    private int mColumns;

    Public Encryption(String message){
        int lenght = message.lenght();

        if (length % 3 == 0){
            mColumns = length / 3;
        } else if (length % 3 == 1){
            mColumns = lenght / 3 + 1;
        } else if (length % 3 == 2) {
            mColumns = lenght / 3 + 2;  //double check after running code
        } else {
            System.out.println('Impossible to run');
        }
        int[][] messageMatrix = setMessageCode(message);

        for (int i = 0; i < mRows; i++) {
            for (int j = 0; j < mColumns; j ++){
                System.out.print(messageMatrix[i][j] + '\t');
            }
            System.out.println();
        }
        int randomNumber = new Random().nextInt(10);
        int[][] encryptionMatrix = Matrix.getMatrix(randomNumber);
        int[][] resultMatrix = Matrix.product(encryptionMatrix, messageMatrix, mRows, mColumns);

        for (int i = 0; i < mRows; i++) {
            for (int j = 0; j < mColumns; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        setCode(resultMatrix, randomNumber);
    }
    private void setCode(int[][] resultMatrix, int randomNumber){
        int[] code = new int[mRows * mColumns];
        int pos = 0;

        for (int i = 0; i < mRows; i){
            for (int j, j < mColumns; j++){
                code[pos++] = resultMatrix[i][j];
            }
        }
        pos = 0;
        int[][] codeMatrix = new int[mRows][mColumns + 1];

        for (int i = 0; i < mRows; i++) {
           for (int j = 0; j < mColumns + 1; j++) {

               if (pos < mRows * mColumns) {
                   codeMatrix[i][j] = code[pos++];
                } else {
                    Random rnd = new Random();
                    if (mColumns > 2) {
                         codeMatrix[i][mColumns - 2] = randomNumber * 9346; //random preference
                         codeMatrix[i][mColumns - 1] = rnd.nextInt(9001);
                         codeMatrix[i][mColumns] = rnd.nextInt(9001);
                     } else {
                        codeMatrix[1][1] = randomNumber * 9346;
                    }
                }
            }
        }
        System.out.println("\n\nYour code is:");
        for (int i = 0; i < mRows; i++) {
            for (int j = 0; j < mColumns + 1; j++) {
                System.out.print((char) codeMatrix[i][j]);
            }
       }
       System.out.println('\n\n');
    }
     private int[][] setMessageCode(String message) {
          int[][] messageCode = new int[mRows][mColumns];
          int count = 0;

          for (int i = 0; i < mRows; i++) {
              for (int j = 0; j < mColumns; j++) {
                   if (count < message.length()) {
                       switch (message.charAt(count++)) {
                           case 'a':
                                messageCode[i][j] = 3;
                                break;
                           case 'A':
                                messageCode[i][j] = 63;
                                break;
                           case 'b':
                                messageCode[i][j] = 1;
                                break;
                            case 'B':
                                messageCode[i][j] = 61;
                                break;
                            case 'c':
                                messageCode[i][j] = 4;
                                break;
                            case 'C':
                                messageCode[i][j] = 64;
                                break;
                            case 'd':
                                messageCode[i][j] = 5;
                                break;
                            case 'D':
                                messageCode[i][j] = 65;
                                break;
                            case 'e':
                                messageCode[i][j] = 9;
                                break;
                            case 'E':
                                messageCode[i][j] = 69;
                                break;
                            case 'f':
                                messageCode[i][j] = 2;
                                break;
                            case 'F':
                                messageCode[i][j] = 62;
                                break;
                            case 'g':
                                messageCode[i][j] = 6;
                                break;
                            case 'G':
                                messageCode[i][j] = 66;
                                break;
                            case 'h':
                                messageCode[i][j] = 8;
                                break;
                            case 'H':
                                messageCode[i][j] = 68;
                                break;
                            case 'i':
                                messageCode[i][j] = 7;
                                break;
                            case 'I':
                                messageCode[i][j] = 67;
                                break;
                            case 'j':
                                messageCode[i][j] = 31;
                                break;
                            case 'J':
                                messageCode[i][j] = 91;
                                break;
                            case 'k':
                                messageCode[i][j] = 14;
                                break;
                            case 'K':
                                messageCode[i][j] = 74;
                                break;
                            case 'l':
                                messageCode[i][j] = 15;
                                break;
                            case 'L':
                                messageCode[i][j] = 75;
                                break;
                            case 'm':
                                messageCode[i][j] = 26;
                                break;
                            case 'M':
                                messageCode[i][j] = 86;
                                break;
                            case 'n':
                                messageCode[i][j] = 35;
                                break;
                            case 'N':
                                messageCode[i][j] = 95;
                                break;
                            case 'o':
                                messageCode[i][j] = 32;
                                break;
                            case 'O':
                                messageCode[i][j] = 92;
                                break;
                            case 'p':
                                messageCode[i][j] = 23;
                                break;
                            case 'P':
                                messageCode[i][j] = 83;
                                break;
                            case 'q':
                                messageCode[i][j] = 18;
                                break;
                            case 'Q':
                                messageCode[i][j] = 78;
                                break;
                            case 'r':
                                messageCode[i][j] = 33;
                                break;
                            case 'R':
                                messageCode[i][j] = 93;
                                break;
                            case 's':
                                messageCode[i][j] = 38;
                                break;
                            case 'S':
                                messageCode[i][j] = 98;
                                break;
                            case 't':
                                messageCode[i][j] = 27;
                                break;
                            case 'T':
                                messageCode[i][j] = 87;
                                break;
                            case 'u':
                                messageCode[i][j] = 28;
                                break;
                            case 'U':
                                messageCode[i][j] = 88;
                                break;
                            case 'v':
                                messageCode[i][j] = 16;
                                break;
                            case 'V':
                                messageCode[i][j] = 76;
                                break;
                            case 'w':
                                messageCode[i][j] = 39;
                                break;
                            case 'W':
                                messageCode[i][j] = 99;
                                break;
                            case 'x':
                                messageCode[i][j] = 20;
                                break;
                            case 'X':
                                messageCode[i][j] = 80;
                                break;
                            case 'y':
                                messageCode[i][j] = 21;
                                break;
                            case 'Y':
                                messageCode[i][j] = 81;
                                break;
                            case 'z':
                                messageCode[i][j] = 22;
                                break;
                            case 'Z':
                                messageCode[i][j] = 82;
                                break;
                            case ' ':
                                messageCode[i][j] = 41;
                                break;
                            case '[':
                                messageCode[i][j] = 25;
                                break;
                            case ']':
                                messageCode[i][j] = 40;
                                break;
                            case ':':
                                messageCode[i][j] = 12;
                                break;
                            case ',':
                                messageCode[i][j] = 11;
                                break;
                            case '-':
                                messageCode[i][j] = 19;
                                break;
                            case '!':
                                messageCode[i][j] = 10;
                                break;
                            case '(':
                                messageCode[i][j] = 29;
                                break;
                            case ')':
                                messageCode[i][j] = 30;
                                break;
                            case '.':
                                messageCode[i][j] = 34;
                                break;
                            case '?':
                                messageCode[i][j] = 37;
                                break;
                            case '"':
                                messageCode[i][j] = 36;
                                break;
                            case ';':
                                messageCode[i][j] = 24;
                                break;
                            case '@':
                                messageCode[i][j] = 13;
                                break;
                            case '\'':
                                messageCode[i][j] = 58;
                                break;
    //						case '?':
    //							messageCode[i][j] = 17;
    //							break;
                            case '$':
                                messageCode[i][j] = 42;
                                break;
                            case '%':
                                messageCode[i][j] = 43;
                                break;
                            case '^':
                                messageCode[i][j] = 44;
                                break;
                            case '&':
                                messageCode[i][j] = 45;
                                break;
                            case '*':
                                messageCode[i][j] = 46;
                                break;
                            case '+':
                                messageCode[i][j] = 47;
                                break;
                            case '_':
                                messageCode[i][j] = 48;
                                break;
                            case '=':
                                messageCode[i][j] = 49;
                                break;
    //						case '?':
    //							messageCode[i][j] = 50;
    //							break;
                            case '~':
                                messageCode[i][j] = 51;
                                break;
                            case '/':
                                messageCode[i][j] = 52;
                                break;
                            case '\\':
                                messageCode[i][j] = 53;
                                break;
                            case '|':
                                messageCode[i][j] = 54;
                                break;
    //						case '?':
    //							messageCode[i][j] = 55;
    //							break;
                            case '`':
                                messageCode[i][j] = 56;
                                break;
                            case '#':
                                messageCode[i][j] = 57;
                                break;
                            case '>':
                                messageCode[i][j] = 59;
                                break;
                            case '<':
                                messageCode[i][j] = 70;
                                break;
                            case '\n':
                                messageCode[i][j] = 60;
                                break;
                            case '\t':
                                messageCode[i][j] = 71;
                                break;
                            case '0':
                                messageCode[i][j] = 100;
                                break;
                            case '1':
                                messageCode[i][j] = 101;
                                break;
                            case '2':
                                messageCode[i][j] = 102;
                                break;
                            case '3':
                                messageCode[i][j] = 103;
                                break;
                            case '4':
                                messageCode[i][j] = 104;
                                break;
                            case '5':
                                messageCode[i][j] = 105;
                                break;
                            case '6':
                                messageCode[i][j] = 106;
                                break;
                            case '7':
                                messageCode[i][j] = 107;
                                break;
                            case '8':
                                messageCode[i][j] = 108;
                                break;
                            case '9':
                                messageCode[i][j] = 109;
                                break;
                            default:
                                messageCode[i][j] = - 1;
                                break;
                        }

                    } else {
                        messageCode[i][j] = - 1;
                    }
                }
            }
             return messageCode;
         }
     }
