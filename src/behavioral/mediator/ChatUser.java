package behavioral.mediator;

class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(name + " send: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
