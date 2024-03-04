package block;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/4 15:33
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registationTime;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistationTime() {
        return registationTime;
    }

//    public void setRegistationTime(long registationTime) {
//        this.registationTime = registationTime;
//    }

    public User(){
        System.out.println("新用户注册时间");
        registationTime = System.currentTimeMillis();
        userName = System.currentTimeMillis() + " ";
        password = "123456";
    }

    public User(String userName, String password) {
        System.out.println("新用户注册时间");
        registationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }

    public String info(){

        return userName+" "+password + " " + registationTime + " ";
    }
}
