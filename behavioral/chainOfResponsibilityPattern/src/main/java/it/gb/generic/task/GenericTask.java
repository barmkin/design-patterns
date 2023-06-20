package it.gb.generic.task;

public abstract class GenericTask {
    protected int taskLevel;
    protected String taskName;
    
    public int getTaskLevel() {
        return taskLevel;
    }
    public String getTaskName() {
        return taskName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + taskLevel;
        result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenericTask other = (GenericTask) obj;
        if (taskLevel != other.taskLevel)
            return false;
        if (taskName == null) {
            if (other.taskName != null)
                return false;
        } else if (!taskName.equals(other.taskName))
            return false;
        return true;
    }
}
