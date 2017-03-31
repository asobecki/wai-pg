package pl.pg.asobecki.wai.spring;

/**
 * Created by asobecki on 31.03.17.
 */
public class Message {
    private final long id;
    private final String recipient;
    private final String content;

    public Message(long id, String recipient, String content) {
        this.id = id;
        this.recipient = recipient;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }
}
