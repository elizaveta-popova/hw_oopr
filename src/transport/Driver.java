package transport;

public abstract class Driver {
    private String name;
    private boolean licence;
    private int grade;

    public Driver(String name, boolean licence, int grade) {
        this.name = name;
        this.licence = licence;
        this.grade = grade;
    }
    public abstract void startMove ();
    public abstract void finishMove ();
    public abstract void refill ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
