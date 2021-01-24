package test;

import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class MapToObject {

    @SneakyThrows
    public Movie mapMovie(String o) {
        System.out.println(o);

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Movie.builder()
                .id(parts[0])
                .rank(Integer.parseInt(parts[1]))
                .title(parts[2])
                .date(Integer.parseInt(parts[3]))
                .rating(Double.parseDouble(parts[4]))
                .build();
    }

    @SneakyThrows
    public Actor mapActor(String o) {
        System.out.println(o);

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Actor.builder()
                .id(parts[0])
                .name(parts[1])
                .biography(parts[2])
                .build();
    }
}
