package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("post 1 body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("post 2 body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("post 3 body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public List<Post> getOnePost() {
        List<Post> posts = new ArrayList<>();

        Post postFirst = new Post();
        postFirst.setTitle("First User Post");
        postFirst.setBody("First User Post body");
        postFirst.setDate(new Date());

        posts.add(postFirst);

        return posts;
    }
}
