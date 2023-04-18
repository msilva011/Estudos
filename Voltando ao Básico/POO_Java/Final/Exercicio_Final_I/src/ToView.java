public class ToView {
  private Student viewer;
  private Video movie;

  public ToView(Student viewer, Video movie) {
      this.viewer = viewer;
      this.movie = movie;
      this.viewer.setTotWatched(this.viewer.getTotWatched() + 1);
      this.movie.setViews(this.movie.getViews() + 1);
    }

  public void avaliar(){
    this.movie.setAssessment(5);
  }
  public void avaliar(int value){
    this.movie.setAssessment(value);
  }

  public void avaliar(float porc){
    int tot=0;

    if(porc <= 20){
      tot=3;
    }else if(porc <=50){
      tot=5;
    }else if(porc <=90){
      tot = 8;
    }else{
      tot=10;
    }

    this.movie.setAssessment(tot);
  }

  public Student getViewer() {
    return viewer;
  }

  public void setViewer(Student viewer) {
    this.viewer = viewer;
  }

  public Video getMovie() {
    return movie;
  }

  public void setMovie(Video movie) {
    this.movie = movie;
  }

  @Override
  public String toString() {
    return "ToView [viewer=" + viewer + ", movie=" + movie + "]";
  }


}