package ramazaniperlik;

public class Lecturer extends Academician{
    private int doorNumber;


    public Lecturer(String nameSurname, String phone, String Email, String department, String title, int doorNumber) {
        super(nameSurname, phone, Email, department, title);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeeting(){
        System.out.println(getNameSurname() + " senato toplantısına katıldı.");
    }
    public void takeATest(){
        System.out.println(getNameSurname() + " sınav salonunda gözetmen olarak görev alıyor.");
    }

    @Override
    public void giris(){
        System.out.println(getNameSurname() + " " + getDoorNumber() + " kapısından giriş yaptı.");
    }

    @Override
    public void derseGir(String lessonTime){
        System.out.println(getNameSurname() + lessonTime + " saatinde derse giriş yaptı.");
    }
}
