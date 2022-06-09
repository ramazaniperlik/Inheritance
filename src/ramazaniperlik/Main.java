package ramazaniperlik;

public class Main {

    public static void main(String[] args) {
          //Employee E1 = new Employee("Ramazan İperlik","123456789","ramazaniperlik@gmail.com");
          //Academician a1 = new Academician ("Ramazan İperlik","1234564587","ramazaniperlik@gmail.com","Computer Engineering","Computer Engineer");
        // Officer O1 = new Officer("Ramazan İperlikkk","2121","denem@gmail.com","","");
          Lecturer L1 = new Lecturer("Ramazan İperlik", "12154545", "", "", "", 2);
//	    System.out.println(a1.getNameSurname());
//        a1.giris();
//        a1.cikis();
//        a1.derseGir();
//        O1.calis();
//        L1.giris();
//        L1.senateMeeting();


//        Employee t = new Academician("ramazan","122","adas","ada","adaw");
    L1.derseGir(" 18.00");
        //Polymorphism
        Employee[] loginUser = {L1};
        Employee.enterWhoPerson(loginUser);

    }
}
