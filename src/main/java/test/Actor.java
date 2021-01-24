package test;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Actor {

    private String id;
    private String name;
    private String biography;

}
