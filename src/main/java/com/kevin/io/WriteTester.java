package com.kevin.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File(".\\jk");
        jkDir.mkdir();
        FileWriter fw = new FileWriter(".\\jk\\output.txt");
        fw.write("這樣子就可以寫入檔案了");
        fw.flush();
        fw.close();
    }
}
