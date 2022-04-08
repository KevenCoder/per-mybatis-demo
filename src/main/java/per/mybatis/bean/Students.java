package per.mybatis.bean;

public class Students {

    int id;
    String name;
    String phone;
    String address;
    float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Students() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students(String name, String phone, String address, float score) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.score = score;
    }

    public Students(int id, String name, String phone, String address, float score) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", score=" + score +
                '}';
    }
}
