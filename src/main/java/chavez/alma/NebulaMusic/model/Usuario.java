package chavez.alma.NebulaMusic.model;

public class Usuario {
    private String name;
    private String email;
    private String dob;
    private String nickname;
    private String password;
    private String suscription;
    private String tyc;

    public Usuario() {

    }

    public String getTyc() {
        return tyc;
    }

    public void setTyc(String tyc) {
        this.tyc = tyc;
    }

    public String getSuscription() {
        return suscription;
    }

    public void setSuscription(String suscription) {
        this.suscription = suscription;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }
}
