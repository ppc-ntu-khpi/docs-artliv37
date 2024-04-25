package domain;

/**
 * Представляє менеджера, який є працівником.
 */
public class Manager extends Employee {

    /**
     * Створює менеджера з вказаним списком підлеглих, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees Масив працівників, які є підлеглими менеджеру.
     * @param name      Ім'я менеджера.
     * @param jobTitle  Посада менеджера.
     * @param level     Рівень менеджера.
     * @param dept      Відділ, до якого належить менеджер.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення менеджера, включаючи інформацію про підлеглих.
     *
     * @return Рядок, що представляє менеджера.
     */
    @Override
    public String toString() {
        return super.toString()+"\nПідлеглі: "+getEmployees(); 
    }

    /**
     * Створює менеджера з вказаним списком підлеглих.
     *
     * @param employees Масив працівників, які є підлеглими менеджеру.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює менеджера з масивом підлеглих розміром 10 елементів.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок, що містить імена підлеглих менеджера.
     *
     * @return Рядок, що містить імена підлеглих менеджера.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих для менеджера.
     *
     * @param employees Масив працівників, які є підлеглими менеджеру.
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив працівників, які є підлеглими менеджеру.
     *
     * @return Масив працівників, які є підлеглими менеджеру.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
