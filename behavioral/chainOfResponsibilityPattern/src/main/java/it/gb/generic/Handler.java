package it.gb.generic;

import it.gb.generic.task.GenericTask;

public interface Handler {
    void execute(GenericTask task);
    void setNextHandler(Handler handler);
}
