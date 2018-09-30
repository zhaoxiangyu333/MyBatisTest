package cn.blz.dto;

public class User {
    private String user_id;
    private String user_name;
    private String role_id;
    private String user_pass;
    private String cname;
    private String user_image;

    public User() {
    }

    public User(String user_id, String user_name, String role_id, String user_pass, String cname, String user_image) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.role_id = role_id;
        this.user_pass = user_pass;
        this.cname = cname;
        this.user_image = user_image;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", role_id='" + role_id + '\'' +
                ", user_pass='" + user_pass + '\'' +
                ", cname='" + cname + '\'' +
                ", user_image='" + user_image + '\'' +
                '}';
    }
}
