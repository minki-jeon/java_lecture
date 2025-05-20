package ch15.sec06.exam02;

public class Message {
    //* Reference : [Book. 이것이 자바다] p.681
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
