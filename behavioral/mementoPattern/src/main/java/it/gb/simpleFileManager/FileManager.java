package it.gb.simpleFileManager;

import java.util.Stack;

/**
 * File Caretaker
 */
public class FileManager {
    private Stack<FileMemento> fileHistory;
    private final int MAX_HISTORY_SIZE = 3;
    
    public FileManager() {
        super();
        this.fileHistory = new Stack<FileMemento>();
    }

    public void saveFileState(File file) {
        if (this.fileHistory.size() >= MAX_HISTORY_SIZE) {
            this.fileHistory.remove(0);
        } 
        this.fileHistory.push(file.save());
    }

    public void revertFileSate(File file) {
        if (this.fileHistory.empty()) {
            System.err.println("Cannot revert! History is empty.");
            return;
        }
        file.revert(this.fileHistory.pop());
    }
}
