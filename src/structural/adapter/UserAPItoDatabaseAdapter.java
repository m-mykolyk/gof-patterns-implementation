package structural.adapter;

class UserAPItoDatabaseAdapter extends UserAPI implements Database {
    @Override
    public void insert() {
        createUser();
    }

    @Override
    public void update() {
        updateUser();
    }

    @Override
    public void select() {
        loadUser();
    }

    @Override
    public void remove() {
        deleteUser();
    }
}
