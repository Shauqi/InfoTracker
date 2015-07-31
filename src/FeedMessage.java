public class FeedMessage {

  String title;
  String description;
  String link;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = "Title: "+title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) 
  {
	  String ne = "\n\nDescription: ";
      this.description = ne+description;
  }

  public String getLink() 
  {
	  
     return link;
  }

  public void setLink(String link) 
  {
	  String n = "\n\nLink: ";
      this.link = n+link+"\n";
  }


  @Override
  public String toString() {
    return  title + description + link ;
  }

} 