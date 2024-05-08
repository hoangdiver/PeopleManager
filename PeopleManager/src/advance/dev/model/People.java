package advance.dev.model;
//thuộc tính này thường được sử dụng để lưu trữ thông tin về cá nhân hoặc đối tượng Thông qua việc lưu trữ thông tin này, lớp có thể sử dụng các phương thức getter và setter để truy cập và cập nhật thông tin của giáo viên, và đảm bảo rằng các dữ liệu này được bảo vệ từ việc truy cập trực tiếp từ bên ngoài lớp.
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
