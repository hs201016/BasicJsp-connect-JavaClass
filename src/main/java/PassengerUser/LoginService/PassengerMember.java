package PassengerUser.LoginService;

public class PassengerMember {


    private String id;

    private String pw;

    private String name;

    private String gender;

    private String phoneNum;

    private String studentId;

    private String place;

    public PassengerMember(String id, String pw, String name, String gender, String phoneNum, String studentId, String place) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.studentId = studentId;
        this.place = place;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
