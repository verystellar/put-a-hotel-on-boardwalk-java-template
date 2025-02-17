package org.circular;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
@SuppressWarnings("unchecked")
public class BoardBuilder {
    CircularlyLinkedList buildBoard(){
        String filePath = "monopoly_spaces.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            CircularlyLinkedList c = new CircularlyLinkedList();
            while ((line = br.readLine()) != null) {
                Node temp = new Node(line);
                c.addNode(temp);
            }
            return c;
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return null;
    }
}
