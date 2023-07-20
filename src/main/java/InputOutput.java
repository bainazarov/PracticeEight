import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        // FileReader и PrintWriter
        File file = new File("output.txt");
        PrintWriter out = new PrintWriter(file);
        FileReader in = new FileReader(file);

        out.print("Hello");
        out.print(123);
        out.close();

        int temp;
        while((temp = in.read())!= -1) {
            System.out.print((char) temp);
        }

        in.close();

        // Input и Output stream
        try (OutputStream outputStream = new FileOutputStream("file.txt")) {
            String content = "Hello123";
            outputStream.write(content.getBytes());
        } catch (IOException e) {
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {
        }

    }
}
