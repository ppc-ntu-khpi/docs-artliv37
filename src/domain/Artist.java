package domain;

/**
 * Представляє художника, який є працівником.
 */
public class Artist extends Employee {

    /**
     * Створює художника з вказаними навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param skills   Масив рядків, що містить навички художника.
     * @param name     Ім'я художника.
     * @param jobTitle Посада художника.
     * @param level    Рівень художника.
     * @param dept     Відділ, до якого належить художник.
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює художника з вказаними навичками.
     *
     * @param skills Масив рядків, що містить навички художника.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Створює художника з масивом навичок розміром 10 елементів.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення художника, включаючи інформацію про навички.
     *
     * @return Рядок, що представляє художника.
     */
    @Override
    public String toString() {
        return super.toString()+"\nНавички: "+getSkills();
    }

    private String[] skills;

    /**
     * Повертає навички художника у вигляді рядка.
     *
     * @return Рядок, що містить навички художника.
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     *
     * @param skills Масив рядків, що містить навички художника.
     */
    public void setSkills(String[] skills) {
        this.skills=skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return Масив рядків, що містить навички художника.
     */
    public String[] getSkillsList() {
        return skills;
    }
}
