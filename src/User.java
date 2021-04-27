 /*
  *User
  *is the superclass of RegisteredUser and AnonymousUser
  *here are all common Attributes and Methods declared
  * Dominik Bregovic
  * Last Change 19.04.2012
  */

import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class User {

    private String nickname;
    private long lastLogin;



    private Date accessionDate;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private LocalDate dateOnly = LocalDate.now();

    public String formateDate(String date){

        return date.replace("/", "-");

    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public Date getAccessionDate() {
        return accessionDate;
    }

    public void setAccessionDate(Date accessionDate) {
        this.accessionDate = accessionDate;
    }

    public LocalDate getDateOnly() {
        return dateOnly;
    }



}

