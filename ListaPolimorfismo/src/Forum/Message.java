package Forum;

public class Message {

    private int id;
    private String text;

    private Person person;

    public Message(int id, String text, Person person) {
        setId(id);
        setText(text);
        setPerson(person);
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public String toString() {
        return "Forum.Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", person=" + person +
                '}';
    }

}
