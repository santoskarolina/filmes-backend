package santos.karolina.filmes.resources.exceptions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Validation extends StandarError{

    private List<FiedMessage> messageList = new ArrayList<>();

    public Validation(Instant timestamp, Integer status, String error, String path, String message) {
        super(timestamp, status, error, path, message);
    }

    public List<FiedMessage> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<FiedMessage> messageList) {
        this.messageList = messageList;
    }

    public void addErros(String name, String message){
        messageList.add(new FiedMessage(name,message));
    }

}
