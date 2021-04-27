/*
 * AnonymousUser
 * is the subclass of User and implemets the Methods of the inteface PrettyPrint
 * here we are useing various methods to determine the date and time in ms
 * Dominik Bregovic
 * Last change 19.04.2021
 */

public class AnonymousUser extends User {

    private String dateFormate;


    public AnonymousUser(String nick) {
        super.setNickname(nick);
        super.setAccessionDate(new java.util.Date());
        this.dateFormate = super.getFormatter().format(super.getAccessionDate());
    }


    @Override
    public String toString() {
        String time = Long.toString(super.getAccessionDate().getTime());

        return "Hallo " + super.getNickname() + ",\n\n" +
                "Sie sind seit " + super.getDateOnly() + " bei uns registriert." + " Letzter Login:\n" +
                "- "+ time + "\n" +
                "- " + super.formateDate(this.dateFormate) + "\n\n" +
                "Viele Gruesse,\n" +
                "Ihr Systemadministrator";
    }

}

