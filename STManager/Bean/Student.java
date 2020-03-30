package STManager.Bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String sid;//主键
    private String sname;
    private String birth;
    private String sex;
    private String tid;
    private int score;

}
