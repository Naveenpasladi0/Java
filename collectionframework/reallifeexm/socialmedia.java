package collectionframework.reallifeexm;

import java.util.*;

class UserProfile {
    private String userId;
    private String name;
    private Set<String> friends;

    public UserProfile(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.friends = new HashSet<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Set<String> getFriends() {
        return friends;
    }

    public void addFriend(String friendId) {
        friends.add(friendId);
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}

class Post {
    private String postId;
    private String userId;
    private String content;
    private Date timestamp;
    private List<String> comments;

    public Post(String postId, String userId, String content, Date timestamp) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
        this.comments = new ArrayList<>();
    }

    public String getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public List<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId='" + postId + '\'' +
                ", userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                ", comments=" + comments +
                '}';
    }
}

class SocialMediaPlatform {
    private Map<String, UserProfile> users;
    private Map<String, List<Post>> userPosts;
    private PriorityQueue<Post> newsFeed;

    public SocialMediaPlatform() {
        this.users = new HashMap<>();
        this.userPosts = new HashMap<>();
        this.newsFeed = new PriorityQueue<>(Comparator.comparing(Post::getTimestamp).reversed());
    }

    // User management methods
    public void addUser(String userId, String name) {
        users.put(userId, new UserProfile(userId, name));
    }

    public UserProfile getUser(String userId) {
        return users.get(userId);
    }

    public void addFriend(String userId, String friendId) {
        UserProfile user = users.get(userId);
        UserProfile friend = users.get(friendId);
        if (user != null && friend != null) {
            user.addFriend(friendId);
            friend.addFriend(userId);
        }
    }

    // Post management methods
    public void addPost(String userId, String content) {
        Post post = new Post(UUID.randomUUID().toString(), userId, content, new Date());
        userPosts.computeIfAbsent(userId, k -> new ArrayList<>()).add(post);
        newsFeed.add(post);
    }

    public List<Post> getUserPosts(String userId) {
        return userPosts.getOrDefault(userId, Collections.emptyList());
    }

    public List<Post> getNewsFeed() {
        return new ArrayList<>(newsFeed);
    }
}

public class socialmedia {
    public static void main(String[] args) {
        SocialMediaPlatform platform = new SocialMediaPlatform();

        // Add users
        platform.addUser("1", "Alice");
        platform.addUser("2", "John");
        platform.addUser("3", "Serita");
        platform.addUser("4", "Waren");

        // Add friends
        platform.addFriend("1", "2");

        // Add posts
        platform.addPost("1", "Hello Guys");
        platform.addPost("2", "Hi Alice");

        // Display user profiles
        System.out.println(platform.getUser("1"));
        System.out.println(platform.getUser("2"));

        // Display user posts
        System.out.println("Alice's Posts: " + platform.getUserPosts("1"));
        System.out.println("John's Posts: " + platform.getUserPosts("2"));

        // Display news feed
        System.out.println("News Feed: " + platform.getNewsFeed());
    }
}