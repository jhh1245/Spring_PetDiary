package vo;

public class NewsItem {
	
	 String link;
     String title;
     String description;
     
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "NewsItem [link=" + link + ", title=" + title + ", description=" + description + "]";
	}
     
     
     
     
}