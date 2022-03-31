package movie;

public class Audience {
    public static void main(String[] args) {
        Rating title1= new Rating();
        title1.setMovieName("Fast and Furious");
        title1.getRatingNumbers();
        System.out.println("I enjoyed " + title1.getMovieName());
        System.out.println("A rating i will give this movie is a " + title1.getRatingNumbers()+ ", it was very interesting.");

    }
}
