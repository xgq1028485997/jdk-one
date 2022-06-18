package com.jdk.one.file;

import com.sun.nio.zipfs.ZipPath;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FileApplication {

    public static void main(String[] args) throws IOException, URISyntaxException {

        Path path = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t\\t.txt");
        Path path1 = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t\\t1.txt");
        Path path2 = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t");
        Path path3 = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t1");
        Path path4 = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t\\t3.txt");
        Path path5 = Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file\\t1\\t4.txt");

        try {
            System.out.println("文件是否存在" + Files.exists(Paths.get("E:\\ws\\jdk-one\\src\\main\\java\\com\\jdk\\one\\file")));

            System.out.println("创建目录 createDirectory" + Files.createDirectory(path2));

            System.out.println("创建目录 createDirectory" + Files.createDirectory(path3));


            System.out.println("创建文件 createFile" + Files.createFile(path));


            System.out.println("创建文件 createFile" + Files.createFile(path1));

            System.out.println("复制文件 copy");
            Files.copy(path1, path4);

            System.out.println("移动文件 move");
            Files.move(path4, path5);

            System.out.println("查看文件个数 size" + Files.size(path));
            System.out.println("写入文件 write");
            Files.write(path5, Arrays.asList("dfdf", "sdsdsdsds"));
            System.out.println("读取文件 readAllLines");
            System.out.println(Files.readAllLines(path5));

            System.out.println(Files.readAllLines(Paths.get("E:\\ws\\jdk-one\\src\\main\\resources\\base.propertis")));


        } finally {
            System.out.println("删除一个文件或目录 delete");
            Files.delete(path);
            Files.delete(path1);
            if (Files.exists(path4)) {
                Files.delete(path4);
            }
            Files.delete(path5);
            Files.delete(path2);
            System.out.println("删除一个文件或目录 delete");
            Files.delete(path3);
        }


    }
}
