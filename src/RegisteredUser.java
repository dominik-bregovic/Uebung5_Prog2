/*
 * RegisteredUser
 * is the subclass of User and implemets the Methods of the inteface PrettyPrint
 * here we are useing various methods to determine the date and time in ms
 * Dominik Bregovic
 * Last change 19.04.2021
 */

import java.time.DayOfWeek;

public class RegisteredUser extends User implements PrettyPrint{

    private String username;
    private String mailAddress;
    private String password;
    private String dateFormat;



    public RegisteredUser(String name, String nick, String mail, String password){

        this.username = name;
        super.setNickname(nick);
        this.mailAddress = mail;
        this.password = password;
        super.setAccessionDate(new java.util.Date());
        this.dateFormat = super.getFormatter().format(super.getAccessionDate());

    }

    public RegisteredUser(){

    }


    @Override
    public String toString() {
        String time = Long.toString(super.getAccessionDate().getTime());

        return "Hallo " + username + ",\n\n" +
                "Sie sind seit " + super.formateDate(this.dateFormat) +
                " bei uns registriert und haben folgende Daten bei uns hinterlegt:\n" +
                "- Mail: " + mailAddress + "\n" +
                "- Pass: " + password + "\n" +
                "- Nick: " + super.getNickname() + "\n\n" +
                "Ihr letzter Login: (ms): " + time +"\n" +
                "Ihr letzter Login: (Date): " + formateMonth() +"\n\n" +
                "Viele Gruesse," + "\n" +
                "Ihr Systemadministrator";
    }

    public String formateMonth(){
        this.dateFormat = super.formateDate(dateFormat);
       String month = Character.toString(dateFormat.charAt(3));
       month = month+ Character.toString(dateFormat.charAt(4));

       switch (month){
           case "01":
               month = "Januar";
               break;
           case "02":
               month = "Februar";
               break;
           case "03":
               month = "Maerz";
               break;
           case "04":
               month = "April";
               break;
           case "05":
               month = "Mai";
               break;
           case "06":
               month = "Juni";
               break;
           case "07":
               month = "Juli";
               break;
           case "08":
               month = "August";
               break;
           case "09":
               month = "September";
               break;
           case "10":
               month = "Oktober";
               break;
           case "11":
               month = "November";
               break;
           case "12":
               month = "Dezember";
               break;
           default:
               System.out.println(" Month not found ");

       }

        return dateFormat.substring(0, 3) + month + dateFormat.substring(5) ;

    }

    public String formateDay(){
        String day = String.valueOf(numberOfDay());
        switch (day){
            case "1":
                day = "Montag";
                break;
            case "2":
                day = "Dienstag";
                break;
            case "3":
                day = "Mittwoch";
                break;
            case "5":
                day = "Donnerstag";
                break;
            case "6":
                day = "Freitag";
                break;
            case "7":
                day = "Samstag";
                break;
            case "8":
                day = "Sonntag";
                break;
            default:
                System.out.println(" Day not found ");

        }

        return day;

    }

    public int numberOfDay(){
        DayOfWeek day = super.getDateOnly().getDayOfWeek();
        return day.getValue();
    }

    @Override
    public String printWithPass() {

        return "Hallo " + username + ",\n\n" +
                "Ihr Passwort „" + password + "“ wurde soeben zur NSA zur Untersuchung geschickt :-)\n\n" +
                "Wir wuenschen einen angenehmen Tag.\n\n" +
                "Mit freundlichen Gruessen,\n" +
                "Mr. X";
    }

    @Override
    public String printWithoutPass() {
        return "Hallo " + username + ",\n\n" +
                "Seit dem letzten Login ist schon einige Zeit vergangen - Ihr letzter Login war am " +
                formateDay() + "., " + this.dateFormat.substring(0, 10) + " um " + this.dateFormat.substring(11) +
                "\n\n" +
                "Viele Gruesse,\n" +
                "Systemadministrator";
    }


    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
