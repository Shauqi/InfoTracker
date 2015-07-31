import java.util.ArrayList;
import java.util.List;

/*
 * Stores an RSS feed
 */
public class Feed {

  final String title;
  final String link;
  final String description;


  final List<FeedMessage> entries = new ArrayList<FeedMessage>();

  public Feed(String title, String link, String description) {
    this.title = title;
    this.link = link;
    this.description = description;
  }

  public List<FeedMessage> getMessages() {
    return entries;
  }

  public String getTitle() {
    return title;
  }

  public String getLink() {
    return link;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return  description + link +  title ;
  }

} 