package pojo;

public class AddAlbum {
    private String userId;
    private String id;
    private String title;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public AddAlbum(String userId, String id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }
}
