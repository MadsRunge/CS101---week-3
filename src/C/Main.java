package C;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Article A1 = new Article("James Gunn", "What we owe the future");
        Article A2 = new Article("Steve Jobs", "The first smartphone");
        Article A3 = new Article("Robert Greene", "Laws of Power");
        Article A4 = new Article("Liam Neeson", "my mind");
        Article A5 = new Article("George lucas", "LightSaberWar");
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(A1);
        articles.add(A2);
        articles.add(A3);
        articles.add(A4);
        articles.add(A5);

        for (Article article : articles) {
            System.out.println(article);
        }


    }
}
