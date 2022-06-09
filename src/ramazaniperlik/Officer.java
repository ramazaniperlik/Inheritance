package ramazaniperlik;

public abstract class Officer extends Employee{

    private String department;
    private String mesai;


    public Officer(String nameSurname, String phone, String email, String department, String mesai) {
        super(nameSurname, phone, email);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(getNameSurname() + " çalışmaya başladı.");
    }

    @Override
    public void giris(){
        System.out.println(getNameSurname() + " override ile geldi.");
    }
}
