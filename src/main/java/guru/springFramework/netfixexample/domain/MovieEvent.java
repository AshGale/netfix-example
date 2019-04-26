package guru.springFramework.netfixexample.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieEvent {

    private String movieId;
    private String date;

}
