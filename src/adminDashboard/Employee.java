package adminDashboard;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private final StringProperty ID;
    private final StringProperty NAME;
    private final StringProperty POSITION;
    private final StringProperty EMAIL;
    private final StringProperty SALARY;

    public Employee(String ID, String NAME, String POSITION, String EMAIL, String SALARY) {
        this.ID = new SimpleStringProperty(ID);
        this.NAME = new SimpleStringProperty(NAME);
        this.POSITION = new SimpleStringProperty(POSITION);
        this.EMAIL = new SimpleStringProperty(EMAIL);
        this.SALARY = new SimpleStringProperty(SALARY);
    }

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getSALARY() {
        return SALARY.get();
    }

    public StringProperty SALARYProperty() {
        return SALARY;
    }

    public void setSALARY(String SALARY) {
        this.SALARY.set(SALARY);
    }
}
