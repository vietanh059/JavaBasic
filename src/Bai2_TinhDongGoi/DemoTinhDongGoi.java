package Bai2_TinhDongGoi;

public class DemoTinhDongGoi {
    private String browser= "Chrome";
    private String url = "123";
    private String email;
    private String password;

    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browserName){
        browserName = browserName.toLowerCase();// chuyển về chữ thường
        browser = browserName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
