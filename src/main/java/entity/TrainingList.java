package entity;

import java.util.List;

public class TrainingList {
    String GUID;
    List<String>subject;

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public List<String> getSubject() {
        return subject;
    }
    public void setSubject(List<String> subject) {
        this.subject = subject;
    }
}
