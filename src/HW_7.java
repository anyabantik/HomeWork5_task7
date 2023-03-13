import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class HW_7 {

    //Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
    //строки из первого, но в обратном порядке (первая строка должна быть последней).
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("INPUT");
        int c;
        while ((c = file.read()) != -1) {
            System.out.print((char) c);
        }
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("INPUT"))) {
            String buf;
            while ((buf = reader.readLine()) != null) {
                strings.add(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("OUTPUT"))) {
            for (int i = strings.size() - 1; i > -1; i--) {
                writer.write(strings.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        }
    }
}
