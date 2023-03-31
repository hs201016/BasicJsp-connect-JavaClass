package PassengerUser.Interface;

import PassengerUser.LoginService.PassengerMember;
import PassengerUser.LoginService.PassengerLoginRepository;

public interface PassengerMemberService {

     void PassengerJoin(PassengerMember passengerMember);

     void PassengerDeleteData(PassengerLoginRepository passengerLoginRepository);

}
