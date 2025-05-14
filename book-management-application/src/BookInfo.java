import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {



    private String bookName;
    private double price;
    private String author;
    private String publisher;
    private String language;


}
