package Encapsulation;

public class Login {
    private String username;
    private String pwd;
    public void setUsername(String username)
    {
        this.username=username;

    }
    public String getUsername()
    {
        if(username.equals("aslam@gmail.com"))
        {
            return "Please enter Password!!";
        }
        else{
           
            return  "Invalid Username";
        }
    }
    public void setPwd(String pwd)
    {
    this.pwd=pwd;
    }
    public String getPwd()
    {
        if(pwd.equals("admin@123"))
        {
            return "Login Successful";
        }
        else{
            
        return "Invalid Password";
    }
    }
    
}

