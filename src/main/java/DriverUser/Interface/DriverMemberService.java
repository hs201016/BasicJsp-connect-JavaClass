package DriverUser.Interface;

import DriverUser.DriverLoginRepository;
import DriverUser.DriverMember;

public interface DriverMemberService {

    void DriverMemberJoin(DriverMember driverMember);

    void DriverMemberDeleteData(DriverLoginRepository driverLoginRepository);

}
