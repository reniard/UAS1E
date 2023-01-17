public class message {
    private String UserID;
    private String Username;
    private String post;
    public String getUserID() { return  UserID; }
    public void setUserID(String UserID) { this.UserID = UserID; }
    public String getUsername() { return Username; }
    public void setUsername(String username) { this.Username = username; }
    public String getPost() { return post; }
    public void setPost(String post) {
        post = post;
    }
    public message(){
    }
    public message(String userID,String username, String post) {
        this.UserID = userID;
        this.Username = username;
        post = post;
    }
}
