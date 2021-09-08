package project.pagination.dao;


import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Gallary {

    private Integer idx;
    private Date gallaryTime;
    private Integer gallaryId;
    private Integer gallarySubscribeCount;
    private Integer gallarySeseon;
    private String gallaryName;
    private String gallaryImageLocation;
    private String gallaryDireaction;
    private String gallaryAdress;
}
