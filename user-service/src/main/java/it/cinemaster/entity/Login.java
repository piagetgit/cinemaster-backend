package it.cinemaster.entity;

public class Login {
    private String id;
    private String logPassword;
    public Login(String id, String password){
        this.id = id;
        this.logPassword = password;
    }

    public String  getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getLogPassword() { return logPassword; }
    public void setLogPassword(String password) { this.logPassword = password; }

    @Override
    public String toString() {
        return "Login{" +
                "id='" + id + '\'' +
                ", logPassword='" + logPassword + '\'' +
                '}';
    }
}
