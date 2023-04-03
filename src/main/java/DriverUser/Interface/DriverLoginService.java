package DriverUser.Interface;

import DriverUser.LoginService.DriverLoginRepository;

public interface DriverLoginService {

    int DriverLogin(DriverLoginRepository driverLoginRepository);

    void DriverLogout();

}
