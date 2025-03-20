package behavioral.mediator;

abstract class User {
    ChatMediator chatMediator;
    String name;

    User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    abstract void send(String message);

    abstract void receive(String message);
}
