package weeklyquiz.contect;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        BusinessContect businessContect = null;
        PersonalContect personalContect = null;

        while (true) {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            try {
            int choice = sc.nextInt();
            sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("이름을 입력하세요: ");
                        String name = sc.next();

                        System.out.print("전화번호를 입력하세요: ");
                        String phoneNumber = sc.next();

                        System.out.print("회사명을 입력하세요: ");
                        String company = sc.next();

                        businessContect = new BusinessContect(name, phoneNumber, company);
                        addressBook.contects.add(businessContect);
                        break;

                    case 2:
                        System.out.print("이름을 입력하세요: ");
                        name = sc.next();
                        System.out.print("전화번호를 입력하세요: ");
                        phoneNumber = sc.next();
                        System.out.print("관계를 입력하세요: ");
                        String relationship = sc.next();

                        personalContect = new PersonalContect(name, phoneNumber, relationship);
                        addressBook.contects.add(personalContect);
                        break;

                    case 3:
                        addressBook.displayContents();
                        break;

                    case 4:
                        if (addressBook.contects.isEmpty()) {
                            System.out.println("연락처가 없습니다");
                            break;
                        }
                        System.out.print("검색할 이름을 입력하세요: ");
                        name = sc.next();
                        addressBook.searchContect(name);
                        break;

                    case 5:
                        addressBook.quit();

                    default:
                        System.out.println("메뉴에 맞는 숫자를 입력하십시오");
                }
            } catch (InputMismatchException e) {
                System.out.println("메뉴에 맞는 숫자를 입력하십시오");
                sc.nextLine();
            }
        }
    }
}