package weeklyquiz.contect;

public class PersonalContect extends Contect{

    String relationship;

    public PersonalContect(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    void display() {
        System.out.println("이름 : " + name + " 전화번호 : " + phoneNumber + " 관계 : " + relationship);
    }
}
