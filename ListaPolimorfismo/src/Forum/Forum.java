package Forum;

import java.util.ArrayList;

public class Forum {

    private int id;
    private String name;
    private String url;

    private ArrayList<Message> message;

    public Forum(int id, String name, String url) {
        setId(id);
        setName(name);
        setUrl(url);
        message = new ArrayList<>();
    }

    public Forum() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getMessage() {
        return message;
    }

    public void setMessage(int id, String text, Person person) {
        this.message.add(new Message(id, text, person));
    }

    @Override
    public String toString() {
        return "Forum.Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", message=" + message +
                '}';
    }
}
