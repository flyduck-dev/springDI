package org.example;
import java.time.LocalDateTime;
import org.example.WrongIdPasswordException;
public class Member {
    private Long id;

    private String email;

    private String password;
    private String name;

    private LocalDateTime registerDataTime;

    public Member(String email, String password,
                  String name, LocalDateTime regDataTime){
        this.email = email;
        this.password = password;
        this.name = name;
        this.registerDataTime = regDataTime;
    }

    void setId(Long id){
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getRegisterDataTime() {
        return registerDataTime;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(!password.equals(oldPassword)){
            throw new WrongIdPasswordException();
        }
        this.password = newPassword;
    }

}
