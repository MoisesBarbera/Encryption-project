package ENCRYPTION PROJECT;

public class Decryption {

    private int mRows  = 3;
       private int mColumns;

       public Decryption(String input) {
           System.out.println("From Decryption : " + input);

              String code = input.substring(0, input.length() - 3);

              int randomNumber = (int) input.charAt(input.length() - 3) / 9346;
              int[][] encryptionMatrix = Matrix.getMatrix(randomNumber);
              int[][] decryptionMatrix = Matrix.inverse(encryptionMatrix);

              mColumns = code.length() / 3;

              int[][] codeMatrix = createMessageMatrix(code);

              for (int i = 0; i < mRows; i++) {
	            for (int j = 0; j < mColumns; j++) {
	                System.out.print(codeMatrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
             int[][] resultMatrix = Matrix.product(decryptionMatrix, codeMatrix, mRows, mColumns);

             for (int i = 0; i < mRows; i++) {
               for (int j = 0; j < mColumns; j++) {
                    System.out.print(resultMatrix[i][j] / Matrix.determinant(encryptionMatrix) + "\t");
               }
               System.out.println();
           }
           createMessage(resultMatrix, Matrix.determinant(encryptionMatrix));
       }
       private int[][] createMessageMatrix(String input) {
	        int[][] codeMatrix = new int[mRows][mColumns];

	        char[] code = input.toCharArray();

	        int pos = 0;
	        for (int i = 0; i < mRows; i++) {
	            for (int j = 0; j < mColumns; j++) {
                      codeMatrix[i][j] = (int) code[pos++];
                }
            }

            return codeMatrix;
        }
        private void createMessage(int[][] resultMatrix, int determinant) {
           char[] messageArray = new char[mRows * mColumns];

           int post = 0;

           for (int i = 0; i < mRows; i++) {
               for (int j = 0; j < mColumns; j++) {

                   switch (resultMatrix[i][j] / determinant) {
   	                    case 3:
   	                        messageArray[post] = 'a';
   	                        break;
   	                    case 63:
   	                        messageArray[post] = 'A';
   	                        break;
   	                    case 1:
   	                        messageArray[post] = 'b';
   	                        break;
   	                    case 61:
   	                        messageArray[post] = 'B';
   	                        break;
   	                    case 4:
   	                        messageArray[post] = 'c';
   	                        break;
   	                    case 64:
   	                        messageArray[post] = 'C';
   	                        break;
   	                    case 5:
   	                        messageArray[post] = 'd';
   	                        break;
   	                    case 65:
   	                        messageArray[post] = 'D';
   	                        break;
   	                    case 9:
   	                        messageArray[post] = 'e';
   	                        break;
   	                    case 69:
   	                        messageArray[post] = 'E';
   	                        break;
   	                    case 2:
   	                        messageArray[post] = 'f';
   	                        break;
   	                    case 62:
   	                        messageArray[post] = 'F';
   	                        break;
   	                    case 6:
   	                        messageArray[post] = 'g';
   	                        break;
   	                    case 66:
   	                        messageArray[post] = 'G';
   	                        break;
   	                    case 8:
   	                        messageArray[post] = 'h';
   	                        break;
   	                    case 68:
   	                        messageArray[post] = 'H';
   	                        break;
   	                    case 7:
   	                        messageArray[post] = 'i';
   	                        break;
   	                    case 67:
   	                        messageArray[post] = 'I';
   	                        break;
   	                    case 31:
   	                        messageArray[post] = 'j';
   	                        break;
   	                    case 91:
   	                        messageArray[post] = 'J';
   	                        break;
   	                    case 14:
   	                        messageArray[post] = 'k';
   	                        break;
   	                    case 74:
   	                        messageArray[post] = 'K';
   	                        break;
   	                    case 15:
   	                        messageArray[post] = 'l';
   	                        break;
   	                    case 75:
   	                        messageArray[post] = 'L';
   	                        break;
   	                    case 26:
   	                        messageArray[post] = 'm';
   	                        break;
   	                    case 86:
   	                        messageArray[post] = 'M';
   	                        break;
   	                    case 35:
   	                        messageArray[post] = 'n';
   	                        break;
   	                    case 95:
   	                        messageArray[post] = 'N';
   	                        break;
   	                    case 32:
   	                        messageArray[post] = 'o';
   	                        break;
   	                    case 92:
   	                        messageArray[post] = 'O';
   	                        break;
   	                    case 23:
   	                        messageArray[post] = 'p';
   	                        break;
   	                    case 83:
   	                        messageArray[post] = 'P';
   	                        break;
   	                    case 18:
   	                        messageArray[post] = 'q';
   	                        break;
   	                    case 78:
   	                        messageArray[post] = 'Q';
   	                        break;
   	                    case 33:
   	                        messageArray[post] = 'r';
   	                        break;
   	                    case 93:
   	                        messageArray[post] = 'R';
   	                        break;
   	                    case 38:
   	                        messageArray[post] = 's';
   	                        break;
   	                    case 98:
   	                        messageArray[post] = 'S';
   	                        break;
   	                    case 27:
   	                        messageArray[post] = 't';
   	                        break;
   	                    case 87:
   	                        messageArray[post] = 'T';
   	                        break;
   	                    case 28:
   	                        messageArray[post] = 'u';
   	                        break;
   	                    case 88:
   	                        messageArray[post] = 'U';
   	                        break;
   	                    case 16:
   	                        messageArray[post] = 'v';
   	                        break;
   	                    case 76:
   	                        messageArray[post] = 'V';
   	                        break;
   	                    case 39:
   	                        messageArray[post] = 'w';
   	                        break;
   	                    case 99:
   	                        messageArray[post] = 'W';
   	                        break;
   	                    case 20:
   	                        messageArray[post] = 'x';
   	                        break;
   	                    case 80:
   	                        messageArray[post] = 'X';
   	                        break;
   	                    case 21:
   	                        messageArray[post] = 'y';
   	                        break;
   	                    case 81:
   	                        messageArray[post] = 'Y';
   	                        break;
   	                    case 22:
   	                        messageArray[post] = 'z';
   	                        break;
   	                    case 82:
   	                        messageArray[post] = 'Z';
   	                        break;
   	                    case 41:
   	                        messageArray[post] = ' ';
   	                        break;
   	                    case 25:
   	                        messageArray[post] = '[';
   	                        break;
   	                    case 40:
   	                        messageArray[post] = ']';
   	                        break;
   	                    case 12:
   	                        messageArray[post] = ':';
   	                        break;
   	                    case 11:
   	                        messageArray[post] = ',';
   	                        break;
   	                    case 19:
   	                        messageArray[post] = '-';
   	                        break;
   	                    case 10:
   	                        messageArray[post] = '!';
   	                        break;
   	                    case 29:
   	                        messageArray[post] = '(';
   	                        break;
   	                    case 30:
   	                        messageArray[post] = ')';
   	                        break;
   	                    case 34:
   	                        messageArray[post] = '.';
   	                        break;
   	                    case 37:
   	                        messageArray[post] = '?';
   	                        break;
   	                    case 36:
   	                        messageArray[post] = '"';
   	                        break;
   	                    case 24:
   	                        messageArray[post] = ';';
   	                        break;
   	                    case 13:
   	                        messageArray[post] = '@';
   	                        break;
   	                    case 17:
   	                        messageArray[post] = '?';
   	                        break;
   	                    case 42:
   	                        messageArray[post] = '$';
   	                        break;
   	                    case 43:
   	                        messageArray[post] = '%';
   	                        break;
   	                    case 44:
   	                        messageArray[post] = '^';
   	                        break;
   	                    case 45:
   	                        messageArray[post] = '&';
   	                        break;
   	                    case 46:
   	                        messageArray[post] = '*';
   	                        break;
   	                    case 47:
   	                        messageArray[post] = '+';
   	                        break;
   	                    case 48:
   	                        messageArray[post] = '_';
   	                        break;
   	                    case 49:
   	                        messageArray[post] = '=';
   	                        break;
   	                    case 50:
   	                        messageArray[post] = '?';
   	                        break;
   	                    case 51:
   	                        messageArray[post] = '~';
   	                        break;
   	                    case 52:
   	                        messageArray[post] = '/';
   	                        break;
   	                    case 53:
   	                        messageArray[post] = '\\';
   	                        break;
   	                    case 54:
   	                        messageArray[post] = '|';
   	                        break;
   	                    case 55:
   	                        messageArray[post] = '?';
   	                        break;
   	                    case 56:
   	                        messageArray[post] = '`';
   	                        break;
   	                    case 57:
   	                        messageArray[post] = '#';
   	                        break;
   	                    case 58:
   	                        messageArray[post] = '\'';
   	                        break;
   	                    case 59:
   	                        messageArray[post] = '>';
   	                        break;
   	                    case 70:
   	                        messageArray[post] = '<';
   	                        break;
   	                    case 60:
   	                        messageArray[post] = '\n';
   	                        break;
   	                    case 71:
   	                        messageArray[post] = '\t';
   	                        break;
   	                    case 100:
   	                        messageArray[post] = '0';
   	                        break;
   	                    case 101:
   	                        messageArray[post] = '1';
   	                        break;
   	                    case 102:
   	                        messageArray[post] = '2';
   	                        break;
   	                    case 103:
   	                        messageArray[post] = '3';
   	                        break;
   	                    case 104:
   	                        messageArray[post] = '4';
   	                        break;
   	                    case 105:
   	                        messageArray[post] = '5';
   	                        break;
   	                    case 106:
   	                        messageArray[post] = '6';
   	                        break;
   	                    case 107:
   	                        messageArray[post] = '7';
   	                        break;
   	                    case 108:
   	                        messageArray[post] = '8';
   	                        break;
   	                    case 109:
   	                        messageArray[post] = '9';
   	                        break;
   	                    case - 1:
   	                        break;
   	                    default:
   	                        messageArray[post] = ' ';
   	                        break;
   	                }

   	                post++;
   	            }
   	        }
            System.out.println("\n\nYour message is : " + new String(messageArray) + "\n\n");
	    }
	}
