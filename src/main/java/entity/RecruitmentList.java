package entity;

public class RecruitmentList {

    private String GUID;
    private boolean Submit;

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public boolean isSubmit() {
        return Submit;
    }

    public void setSubmit(boolean submit) {
        Submit = submit;
    }
}
