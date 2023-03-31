package DriverUser;

public class DriverMember {

    String DriverId;

    String DriverPw;

    String DriverName;

    String DriverGender;

    String DriverPhoneNum;

    String DriverPlace;

    public DriverMember(String driverId, String driverPw, String driverGender, String driverName, String driverPhoneNum, String driverPlace) {
        DriverId = driverId;
        DriverPw = driverPw;
        DriverGender = driverGender;
        DriverName = driverName;
        DriverPhoneNum = driverPhoneNum;
        DriverPlace = driverPlace;
    }

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

    public String getDriverGender() {
        return DriverGender;
    }

    public void setDriverGender(String driverGender) {
        DriverGender = driverGender;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getDriverPhoneNum() {
        return DriverPhoneNum;
    }

    public void setDriverPhoneNum(String driverPhoneNum) {
        DriverPhoneNum = driverPhoneNum;
    }

    public String getDriverPlace() {
        return DriverPlace;
    }

    public void setDriverPlace(String driverPlace) {
        DriverPlace = driverPlace;
    }

}
