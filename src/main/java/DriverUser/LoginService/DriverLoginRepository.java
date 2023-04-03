package DriverUser.LoginService;

public class DriverLoginRepository {

    String DriverId;

    String DriverPw;

    public String getDriverId() {
        return DriverId;
    }

    public void setDriverId(String driverId) {
        DriverId = driverId;
    }

    public String getDriverPw() {
        return DriverPw;
    }

    public void setDriverPw(String driverPw) {
        DriverPw = driverPw;
    }

    public DriverLoginRepository(String driverId, String driverPw) {
        DriverId = driverId;
        DriverPw = driverPw;
    }



}
