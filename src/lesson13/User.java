package lesson13;

public class User {
    private long id;
    private String name;
    private String sessionId;



    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", session id=" + sessionId +
                '}';
    }

    public String getSessionId() {
        return sessionId;
    }
}
