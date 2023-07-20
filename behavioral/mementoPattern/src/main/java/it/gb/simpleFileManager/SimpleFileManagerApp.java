package it.gb.simpleFileManager;

public class SimpleFileManagerApp {

    public static void executeSimpleFileManagerApp() {
        // Create a new "files"
        File file1 = new File("File1");
        File file2 = new File("File2");
        File file3 = new File("File3");

        // Create file managers to track file history
        FileManager fileManager1 = new FileManager();
        FileManager fileManager2 = new FileManager();
        FileManager fileManager3 = new FileManager();

        // add and save contents
        file1.addContent("Test 1 2 3");
        file1.addContentOnNewLine("4 5 6");
        file1.addContentOnNewLine("7 8 9");
        fileManager1.saveFileState(file1);

        file2.addContent("01010100 01100101 01110011 01110100 00100000 01100110 01101001 01101100 01100101 00100000 00110010");
        fileManager2.saveFileState(file2);

        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);
        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);
        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);
        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);
        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);
        file3.addContent("01010101 00000000 01010100 00000000 01000110 00000000 00101101 00000000 00110001 00000000 00110110 00000000");
        fileManager3.saveFileState(file3);

        // add more content
        file1.addContentOnNewLine("10 100 1000");
        file1.addContentOnNewLine("20 200 2000");

        // save
        fileManager1.saveFileState(file1);

        // change file name
        file1.setFileName("Main test file.txt");

        // add more content
        file1.addContentOnNewLine("qwertyuiop undo this line!");

        // undo last add file 1
        fileManager1.revertFileSate(file1);

        // try to undo last 3 adds file 3
        fileManager3.revertFileSate(file3);
        fileManager3.revertFileSate(file3);
        fileManager3.revertFileSate(file3);
        // and one more undo
        fileManager3.revertFileSate(file3);
        
        // print files
        System.out.println(file1.getContent());
        System.out.println(file2.getContent());
        System.out.println(file3.getContent());
    }
    
}
