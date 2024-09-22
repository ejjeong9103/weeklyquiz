package weeklyquiz.contect;

public class Contect {
    String name;
    String phoneNumber;

    public Contect(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println("이름 : " + name + " 전화번호 : " + phoneNumber);
    }
}
