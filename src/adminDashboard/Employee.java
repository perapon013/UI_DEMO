package adminDashboard;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private final IntegerProperty ID;
    private final StringProperty NAME;
    private final StringProperty POSITION;
    private final StringProperty EMAIL;
    private final DoubleProperty SALARY;

    public Employee(IntegerProperty ID, StringProperty NAME, StringProperty POSITION, StringProperty EMAIL, DoubleProperty SALARY) {
        this.ID = ID;
        this.NAME = NAME;
        this.POSITION = POSITION;
        this.EMAIL = EMAIL;
        this.SALARY = SALARY;
    }

    public int getID() {
        return ID.get();
    }

    public IntegerProperty IDProperty() {
        return ID;
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getNAME() {
        return NAME.get();
    }

    public StringProperty NAMEProperty() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME.set(NAME);
    }

    public String getPOSITION() {
        return POSITION.get();
    }

    public StringProperty POSITIONProperty() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION.set(POSITION);
    }

    public String getEMAIL() {
        return EMAIL.get();
    }

    public StringProperty EMAILProperty() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL.set(EMAIL);
    }

    public double getSALARY() {
        return SALARY.get();
    }

    public DoubleProperty SALARYProperty() {
        return SALARY;
    }

    public void setSALARY(double SALARY) {
        this.SALARY.set(SALARY);
    }
}
