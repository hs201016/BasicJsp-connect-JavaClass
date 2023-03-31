package PassengerUser.Interface;

import PassengerUser.LoginService.PassengerLoginRepository;

public interface PassengerLoginService {

    int login(PassengerLoginRepository PassengerLoginRepository);

    void logout();
}
 