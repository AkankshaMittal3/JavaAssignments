package akanksha.javaincrementalassignment7;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaIncrementalAssignment7 {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileReader file1=null;
        try
        {
            file1 = new FileReader(name);
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        int c;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while((c = file1.read()) != -1)
        {
            System.out.println((char)c);
            if(hashMap.containsKey((char)c))
            {
                int count = hashMap.get((char)c);
                hashMap.put((char)c, count+1);
            }
            else if((char)c != '\n' && (char)c != ' ' )
            {
                hashMap.put((char)c, 1);
            }
        }
        file1.close();

        FileWriter file2 = new FileWriter("result.txt");
       for(Map.Entry<Character,Integer> entry : hashMap.entrySet())
       {
           String line = (entry.getKey() + " " + entry.getValue() + "\n");
           file2.write(line);
        }
       file2.close();
    }
}
