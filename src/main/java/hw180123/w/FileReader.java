package hw180123;

import java.io.*;
import java.util.ArrayList;


public class FileReader {
    public static void main(String[] args) {
        ArrayList cardList;
        
        try (ObjectInputStream inputStream
                = new ObjectInputStream(new FileInputStream("cardList.bin"))) {
                cardList = (ArrayList) inputStream.readObject();
            System.out.println(cardList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
