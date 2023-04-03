package DriverUser.Interface;

public interface DriverUserInsertData {

    public void InsertDriverJDBCConnection(); // Insert는 아닌데 형식상 같이 넣어둠
    public void InsertDriverMemberJoinData();

    public void InsertDriverDeleteData();

    public void InsertDriverLoginData();

    public void InsertDriverLogoutData();
}
