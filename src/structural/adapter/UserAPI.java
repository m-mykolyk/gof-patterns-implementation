package structural.adapter;

class UserAPI {
    void createUser() {
        System.out.println("User was saved.");
    }

    void updateUser() {
        System.out.println("User was updated.");
    }

    void loadUser() {
        System.out.println("User was loaded.");
    }

    void deleteUser() {
        System.out.println("User was deleted");
    }
}
