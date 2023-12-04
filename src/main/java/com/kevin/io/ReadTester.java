package com.kevin.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        FileReader();
//        inputStream();
    }

    private static void FileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1) {
                System.out.print((char) n);
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try (InputStream is = new FileInputStream(file)) {
            int n = is.read();
            while (n != -1) {
                System.out.print((char) n);
                n = is.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File open process end");
    }
}