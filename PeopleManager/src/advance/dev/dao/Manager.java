package advance.dev.dao;

import advance.dev.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Teacher> teacherList = new ArrayList<>();

    // Thêm giáo viên vào danh sách
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    // In danh sách giáo viên hiện có
    public void printTeacherList() {
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách giáo viên trống.");
        } else {
            System.out.println("Danh sách giáo viên:");
            for (Teacher teacher : teacherList) {
                System.out.println("Tên: " + teacher.getName() + ", Tuổi: " + teacher.getAge() + ", Mã giáo viên: " + teacher.getTeacherID());
            }
        }
    }

    // Lấy ra số giáo viên hiện có trong danh sách
    public int getNumberOfTeachers() {
        return teacherList.size();
    }

    // Lấy ra tên giáo viên có tuổi cao nhất
    public String getNameOfOldestTeacher() {
        if (teacherList.isEmpty()) {
            return null;
        }

        Teacher oldestTeacher = teacherList.get(0);
        for (Teacher teacher : teacherList) {
            if (teacher.getAge() > oldestTeacher.getAge()) {
                oldestTeacher = teacher;
            }
        }
        return oldestTeacher.getName();
    }
}