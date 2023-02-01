package drivers;

public abstract class Driver {
    private String name;
    private boolean licence;
    private int grade;

    public Driver(String name, boolean licence, int grade) {
        this.name = name;
        this.licence = licence;
        this.grade = grade;
    }

    public abstract void checkLicence() throws LicenceException;

    public abstract void startMove ();
    public abstract void finishMove ();
    public abstract void refill ();

    public abstract void  checkLicence (boolean licence) throws LicenceException;
    public static void checkLicence (Driver... drivers) {
        for (Driver driver: drivers){
            try {
                driver.checkLicence(driver.licence);
            } catch (UnsupportedOperationException e) {
                if (driver.licence = false) {
                System.out.println("Ошибка.");
                System.out.println(e.getMessage());
            } }
            catch (LicenceException e) {
                throw new RuntimeException(e);
            }
        }
    }



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
