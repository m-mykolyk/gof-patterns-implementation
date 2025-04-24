package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "John");
        User user2 = new ChatUser(chatRoom, "Alice");
        User user3 = new ChatUser(chatRoom, "Bob");
        User user4 = new ChatUser(chatRoom, "Daisy");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello, World!");
        user2.send("Hello, John!");
    }
}
