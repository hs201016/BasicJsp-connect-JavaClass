package PassengerUser.LoginService;

public class PassengerLoginRepository { // delete를 위한 class

    String id;

    String pw;

    public PassengerLoginRepository(String id, String pw) {
        this.id = id;
        this.pw = pw;
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
}
