package ramazaniperlik;

public abstract class Academician extends Employee{
    private String department;
    private String title;

    public Academician(String nameSurname, String phone, String Email, String department, String title){
        super(nameSurname,phone,Email);
        this.department = department;
        this.title = title;
    }

    public void setDepartment(String Department){
        this.department = Department;
    }
    public void setTitle(String Title){
        this.title = Title;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getTitle(){
        return this.title;
    }

    public abstract void derseGir(String lessonTime);

    @Override
    public void giris(){
        System.out.println(getNameSurname() + " kapıdan giriş yaptı.");
    }
}
