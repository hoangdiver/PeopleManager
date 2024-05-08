package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.Teacher;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Tạo một đối tượng Manager
        Manager manager = new Manager();
        
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu nhập thông tin giáo viên từ bàn phím
        System.out.println("Nhập thông tin giáo viên:");
        while (true) {
            System.out.print("Tên giáo viên (nhấn Enter để kết thúc): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự new line sau khi đọc int

            System.out.print("Mã giáo viên: ");
            String teacherID = scanner.nextLine();

            Teacher teacher = new Teacher(name, age, teacherID);

            manager.addTeacher(teacher);
        }

        System.out.println("Danh sách giáo viên:");
        manager.printTeacherList();

        int numberOfTeachers = manager.getNumberOfTeachers();
        System.out.println("Số giáo viên hiện có trong danh sách: " + numberOfTeachers);

        String oldestTeacherName = manager.getNameOfOldestTeacher();
        if (oldestTeacherName != null) {
            System.out.println("Tên của giáo viên có tuổi cao nhất: " + oldestTeacherName);
        } else {
            System.out.println("Không có giáo viên trong danh sách.");
        }
        scanner.close();
    }
}
