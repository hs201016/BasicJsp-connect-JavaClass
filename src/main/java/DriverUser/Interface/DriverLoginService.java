package DriverUser.Interface;

import DriverUser.DriverLoginRepository;

public interface DriverLoginService {

    int DriverLogin(DriverLoginRepository driverLoginRepository);

    void DriverLogout();

}
