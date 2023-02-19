package EAndF;

import java.util.ArrayList;
import java.util.Date;

import static EAndF.RedditFrontPage.removePostByIndex;

public class Main {
    public static void main(String[] args) {
        Date Date;
        RedditPost post1 = new RedditPost("john", "fatshaming");
        RedditPost post2 = new RedditPost("niels", "football");
        RedditPost post3 = new RedditPost("jesper", "bitcoin");
        RedditPost post4 = new RedditPost("jay", "fitness");


        ArrayList<RedditPost> postlist = new ArrayList<>();
        postlist.add(post1);
        postlist.add(post2);
        postlist.add(post3);
        postlist.add(post4);

        //System.out.println(postlist);

        removePostByIndex(postlist,3);
        System.out.println(postlist);




    }
}
