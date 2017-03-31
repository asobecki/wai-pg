package pl.pg.asobecki.wai.spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by asobecki on 31.03.17.
 */
// ignore properties not defined in this class
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private long id;
    private String recipient;
    private String content;

    public Message() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", recipient='" + recipient + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
