package domain;

/**
 * Представляє працівника.
 */
public class Employee {

    /**
     * Повертає рядкове представлення працівника, включаючи інформацію про ідентифікатор, ім'я, посаду, рівень та відділ.
     *
     * @return Рядок, що представляє працівника.
     */
    @Override
    public String toString() {
        return "\nІдентифікатор працівника= " + ID + "\nІм'я= " + name + "\nПосада= " + jobTitle + "\nРівень= " + level + "\nВідділ= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    // private static int employeesCount = 0;

    /**
     * Створює працівника з вказаними ім'ям, посадою, рівнем та відділом.
     *
     * @param name     Ім'я працівника.
     * @param jobTitle Посада працівника.
     * @param level    Рівень працівника.
     * @param dept     Відділ, до якого належить працівник.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює працівника з випадковим ідентифікатором.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job Посада працівника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return Посада працівника.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return Ім'я працівника.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     *
     * @param level Рівень працівника.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return Рівень працівника.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ, до якого належить працівник.
     *
     * @return Відділ, до якого належить працівник.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ, до якого належить працівник.
     *
     * @param dept Відділ, до якого належить працівник.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * Якщо ім'я не відповідає шаблону, встановлюється значення за замовчуванням ("John Doe").
     *
     * @param name Ім'я працівника.
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
