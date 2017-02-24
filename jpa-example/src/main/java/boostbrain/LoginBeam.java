package boostbrain;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by BoostBrain on 24.02.2017.
 */

@Named
@SessionScoped
public class LoginBeam implements Serializable{
    private boolean loggedIn;
    private String login;
    private String password;

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

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

    public void checkPassword(){
        UserEntity userEntity = entityManager.find(UserEntity.class, login);
        if(userEntity == null){
            return;
        }

        loggedIn = userEntity.getPassword().equals(password);
    }
}
