package boostbrain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by BoostBrain on 24.02.2017.
 */

@Entity
public class UserEntity {
    @Id
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
