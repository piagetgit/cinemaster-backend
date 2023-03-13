package it.cinemaster.component;

public class Login {
    private int id;
    private String logPassword;
    public Login(int id, String password){
        this.id = id;
        this.logPassword = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getLogPassword() { return logPassword; }
    public void setLogPassword(String password) { this.logPassword = password; }
}
