public class User extends Person {
    private boolean isAdmin;

    public void user(boolean isAdmin) {
        this.isAdmin = isAdmin;
//        return isAdmin;
    }

    public boolean isAdmin(String User) {
        if (User.equals(isAdmin)) {
            return true;
        }
    }
}