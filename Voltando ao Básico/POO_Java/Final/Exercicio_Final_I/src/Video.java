class Video implements Interface{

  private String title;
  private int assessment;
  private int views;
  private int likes;
  private boolean reproduced;


  

  public Video(String title) {
    this.title = title;
    this.likes = 0;
    this.assessment = 0;
    this.views = 0;
    this.reproduced = false;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getAssessment() {
    return assessment;
  }

  public void setAssessment(int assessment) {
    int new_assessment;
    new_assessment = (int) ((this.assessment + assessment)/this.views);

    this.assessment = new_assessment;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public boolean isReproduced() {
    return reproduced;
  }

  public void setReproduced(boolean reproduced) {
    this.reproduced = reproduced;
  }

  @Override
  public void like() {
    this.setLikes(likes++);
  }

  @Override
  public void pause() {
    this.setReproduced(false);
  }

  @Override
  public void play() {
    this.setReproduced(true);
  }

  @Override
  public String toString() {
    return "Video [title=" + title + ", assessment=" + assessment + ", views=" + views + ", likes=" + likes
        + ", reproduced=" + reproduced + "]";
  }

  
  
}
