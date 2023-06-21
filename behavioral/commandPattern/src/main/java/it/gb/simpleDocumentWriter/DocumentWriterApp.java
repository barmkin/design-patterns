package it.gb.simpleDocumentWriter;

// client
public class DocumentWriterApp {
    public static void testDocumentWriter() {
        CommandRunner commandRunner = new CommandRunner();  
        Document document = new Document();      

        String text1 = "Test 1\n";
        String text2 = "Test 2\n";
        String text3 = "Test 3\n";
        String text4 = "Test 4\n";

        WriteCommand writeCommand1 = new WriteCommand(document, text1);
        WriteCommand writeCommand2 = new WriteCommand(document, text2);
        WriteCommand writeCommand3 = new WriteCommand(document, text3);
        WriteCommand writeCommand4 = new WriteCommand(document, text4);

        // Test EXECUTE
        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand1);

        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand2);

        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand3);

        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand4);

        System.out.println(document.getDocumentContent());

        // Test UNDO
        commandRunner.undo();
        System.out.println(document.getDocumentContent());

        // Test UNDO
        commandRunner.undo();
        System.out.println(document.getDocumentContent());

        // Test UNDO
        commandRunner.undo();
        System.out.println(document.getDocumentContent());


        // Test UNDO overflow
        commandRunner.undo();
        System.out.println(document.getDocumentContent());

        // Mix write and undo
        commandRunner.storeAndExecute(writeCommand2);
        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand2);
        System.out.println(document.getDocumentContent());
        commandRunner.undo();
        System.out.println(document.getDocumentContent());
        commandRunner.storeAndExecute(writeCommand2);
        System.out.println(document.getDocumentContent());


    }
}
