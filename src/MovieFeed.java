import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */
public class MovieFeed {

  final String title;

  final List<MovieFeedMessage> entries = new ArrayList<MovieFeedMessage>();

  public MovieFeed(String title) {
    this.title = title;
  }

  public List<MovieFeedMessage> getMessages() {
    return entries;
  }

  public String getTitle() {
    return title;
  }
 

  @Override
  public String toString() {
    return  title ;
  }

} 