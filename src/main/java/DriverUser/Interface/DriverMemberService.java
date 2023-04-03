package DriverUser.Interface;

import DriverUser.LoginService.DriverLoginRepository;
import DriverUser.LoginService.DriverMember;

public interface DriverMemberService {

    void DriverMemberJoin(DriverMember driverMember);

    void DriverMemberDeleteData(DriverLoginRepository driverLoginRepository);

}
