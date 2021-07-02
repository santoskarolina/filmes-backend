package santos.karolina.filmes.resources.exceptions;

import java.io.Serializable;

public class FiedMessage implements Serializable {

    private String name;
    private String message;

    public FiedMessage(){}

    public FiedMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
