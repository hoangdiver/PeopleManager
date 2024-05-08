package advance.dev.model;

import advance.dev.dao.IPeople;

public class Teacher extends People implements IPeople {
    private String teacherID;

    public Teacher(String name, int age, String teacherID) {
        super(name, age);
        this.teacherID = teacherID;
    }

    // Getter và Setter cho thuộc tính teacherID
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    // Phương thức từ interface IPeople
    @Override
    public void add() {
        // Cài đặt để thêm giáo viên
        System.out.println("Thêm giáo viên: " + getName() + " (ID: " + teacherID + ")");
    }

    @Override
    public void printPeople() {
        // Cài đặt để in thông tin của giáo viên
        System.out.println("Thông tin giáo viên:");
        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Mã giáo viên: " + teacherID);
    }

    // Các phương thức khác của lớp Teacher
    public void teach() {
        // Cài đặt phương thức dạy
        System.out.println(getName() + " đang dạy...");
    }
}
