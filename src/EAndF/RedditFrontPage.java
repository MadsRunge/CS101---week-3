package EAndF;

import java.util.ArrayList;

public class RedditFrontPage {
    private ArrayList<RedditPost> postlist;


    public static void removePostByIndex(ArrayList<RedditPost> postlist, int indexNumber) {
        if (indexNumber >= 0 && indexNumber < postlist.size()) {
            postlist.remove(indexNumber);
        }
    }
    }
