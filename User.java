abstract class User {

    protected int userId;
    protected String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public abstract int getBorrowLimit();

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}

class StudentUser extends User {

    public StudentUser(int id, String name) {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() {
        return 3;
    }

    @Override
    public String toString() {
        return "Student | ID: " + userId +
                " | Name: " + name;
    }
}

class FacultyUser extends User {

    public FacultyUser(int id, String name) {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    @Override
    public String toString() {
        return "Faculty | ID: " + userId +
                " | Name: " + name;
    }
}
