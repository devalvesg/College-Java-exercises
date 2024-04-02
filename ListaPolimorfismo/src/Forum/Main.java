package Forum;

public class Main {

    public static void main(String[] args) {

        Person pesssoa1 = new Person(1, "Gabriel", "biel");
        Person pesssoa2 = new Person(2, "Lucas", "luca");

        Forum forum = new Forum(1, "conversinha", "forum1.com.br");

        forum.setMessage(1, "Ola amigos", pesssoa1);

        System.out.println(forum);
    }
}
