package HomeWork;

public enum Mark {
    BMW ("BMW");
    private String mark;
    Mark (String mark){
        this.mark=mark;
    }

    public String getMark() {
        return mark;
    }
}
