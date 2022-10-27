package springTest.model;

import java.io.Serializable;

public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 2618232895787038631L;

    private String id = null;
    private String pw = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString(){
        return "LoginInfo [ id ="+id+", pw ="+pw+"]";
    }
}
