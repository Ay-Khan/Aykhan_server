package ServerSocket;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
        private String userName;
        private String messageText;
        private Date sentDate;

    public MessageData() {
    }

    public MessageData(String userName, String messageText, Date sentDate) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = sentDate;
    }

    @Override
    public String toString() {
        return "MessageData{" +
                "userName='" + userName + '\'' +
                ", messageText='" + messageText + '\'' +
                ", sentDate=" + sentDate +
                '}';
    }
}
