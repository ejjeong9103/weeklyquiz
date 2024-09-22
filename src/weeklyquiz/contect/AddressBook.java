package weeklyquiz.contect;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contect> contects = new ArrayList<>();

    void quit() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }

    void searchContect(String name) {
        boolean flag = false;
        for (Contect contect : contects) {
            if (contect.name.equals(name)) {
                contect.display();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("연락처를 찾을 수 없습니다");
        }
    }

    void displayContents() {
        if (contects.isEmpty()) {
            System.out.println("연락처가 비어 있습니다");
        }
        for (Contect contect : contects) {
            contect.display();
        }
    }
}
