package project.pagination.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.pagination.dao.Gallary;
import project.pagination.dao.Page;
import project.pagination.mapper.PaginationMapper;

@Service
@Slf4j
public class PaginationService {

    @Autowired
    PaginationMapper paginationMapper;



    private static final Integer PER_PAGE = 20;

    /*페이지당 Galley 가져오기*/
    public String pageGalleyShow(Page page){

        Integer count = gallerycount();
        Gallary gallary = null;

        Integer injectPage = page.getSpage();
        int fInjectPage = injectPage * 20; // 1 Page = 20
        int lInjectPage = injectPage * 30; // 2 Page = 40

        while ( 1 <= 20 ){

            if(gallary.getIdx() == 0){
                break;
            }
        }
        return "ok";
    }


    /* 페이지 개수 구하기 */
    public Integer gallerycountpage() throws Exception {
        Integer count = gallerycount(); // 모든 그림 갯수

        Integer result = count / PER_PAGE;
        if (count % PER_PAGE != 0) {
            result += 1;
        }
        log.info("page count ::: {}", result);
        return result;
    }

    /* 모든 그림 개수 세아리기 */
    public Integer gallerycount() {
        try {
            Integer count = paginationMapper.gallerycount();
            log.info("count value ::: " + count.toString());
            return count;
        } catch (Exception e) {
            log.info("exception raised ::: " + e.getMessage());
            return -100;
        }
    }

}
