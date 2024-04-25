package domain;

/**
 * Представляє редактора, який є видавцем.
 */
public class Editor extends Artist {

    /**
     * Створює редактора з вказаними налаштуваннями редагування, навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing Показує, чи є редагування електронним (true) або паперовим (false).
     * @param skills            Масив рядків, що містить навички редактора.
     * @param name              Ім'я редактора.
     * @param jobTitle          Посада редактора.
     * @param level             Рівень редактора.
     * @param dept              Відділ, до якого належить редактор.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з вказаними налаштуваннями редагування та навичками.
     *
     * @param electronicEditing Показує, чи є редагування електронним (true) або паперовим (false).
     * @param skills            Масив рядків, що містить навички редактора.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з вказаними налаштуваннями редагування.
     *
     * @param electronicEditing Показує, чи є редагування електронним (true) або паперовим (false).
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює редактора з налаштуваннями редагування за замовчуванням (електронне редагування).
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи інформацію про налаштування редагування.
     *
     * @return Рядок, що представляє редактора.
     */
    @Override
    public String toString() {
        String s = super.toString()+"\nНалаштування редагування: ";
        if (electronicEditing)
            s = s + "електронне";
        else
            s = s + "паперове";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає налаштування редагування редактора.
     *
     * @return true, якщо редагування електронне, false, якщо редагування паперове.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює налаштування редагування для редактора.
     *
     * @param electronic Показує, чи є редагування електронним (true) або паперовим (false).
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
