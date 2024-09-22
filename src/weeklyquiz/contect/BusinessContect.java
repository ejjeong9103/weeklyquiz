package weeklyquiz.contect;

public class BusinessContect extends Contect{

    String company;

    public BusinessContect(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    void display() {
        System.out.println("이름 : " + name + " 전화번호 : " + phoneNumber + " 회사 : " + company);
    }
}
