package test;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

  //  private List<Actor> actors;
    @CsvBindByName(column = "IMDb id", required = true) private String id;
    @CsvBindByName(column = "Rank", required = true) private int rank;
    @CsvBindByName(column = "Title", required = true) private String title;
    @CsvBindByName(column = "Date", required = true) private int date;
    @CsvBindByName(column = "Rating", required = true) private double rating;


//    public void addActor(Actor actor) {
//        this.actors.add(actor);
//    }

}
