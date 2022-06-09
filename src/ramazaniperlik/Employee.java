package ramazaniperlik;

public abstract class Employee {
    private String nameSurname;
    private String phone;
    private String email;

    public Employee(String nameSurname, String phone, String email){
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }

    public void giris(){
        System.out.println(this.nameSurname + " giriş yaptı.");
    }
    public void cikis(){
        System.out.println(this.nameSurname + " çıkış yaptı.");
    }
    public void yemekhane(){
        System.out.println(this.nameSurname + " yemekhaneye gitti.");
    }

    public static void enterWhoPerson(Employee[] loginUser){
        for(Employee c : loginUser){
            c.giris();
        }
    }
}
