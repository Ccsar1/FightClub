import java.util.Random;

public class User {

    private String name;
    private String nick;
    private String password;
    private String register_number;

    public User(String name, String nick, String password, String register_number){
        this.name=name;
        this.nick=nick;
        this.password=password;
        this.register_number=register_number;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNick(){
        return nick;
    }
    public void setNick(String nick){
        this.nick=nick;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getRegister_number(){
        return register_number;
    }
    public static String setRegister_number(){
        StringBuilder builder = new StringBuilder();
        builder.append(getRandomLetter());
        builder.append(getRandomNumber());
        builder.append(getRandomNumber());
        builder.append(getRandomLetter());
        builder.append(getRandomLetter());
        String register= builder.toString();
        return register;
    }

    public static char getRandomLetter(){
        Random random= new Random();
        return (char) (random.nextInt(26)+'A');
    }
    public static int getRandomNumber(){
        Random random= new Random();
        return random.nextInt(10);
    }
    public String getUser(){
        return "Name: "+getName()+",Nick: "+getNick()+",Password: "+getPassword()+",Register_id: "+getRegister_number();
    }
}
