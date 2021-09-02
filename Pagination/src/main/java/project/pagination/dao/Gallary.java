package project.pagination.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Gallary {

    private int gallaryId;

    private  int idx;

    private String gallaryAdress;

    private String gallaryTime;

    private int gallarySeseon;

    private String gallaryDireaction;

    private String gallaryName;

    private String gallaryImageLocation;

    private int gallarySubscribeCount;

}
