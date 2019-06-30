package news;

import java.util.TreeSet;

public final class BaseDeNews {
    private static TreeSet<News> newsSet;

    public static void initialise() {
        newsSet = new TreeSet<>();
    }

    public static TreeSet<News> getNewsSet() {
        return newsSet;
    }

    public static void ajoute(News news) {
        newsSet.add(news);
    }
}
