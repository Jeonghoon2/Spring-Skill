package project.pagination.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.pagination.mapper.PaginationMapper;

@Service
@Slf4j
public class PaginationService {

    @Autowired
    PaginationMapper paginationMapper;

    /* 페이지 개수 구하기 */
    public Integer gallerycountpage() {
        Integer count = gallerycount();
        Integer calculate;
        calculate = count % 20;
        try {

            if (calculate >= 0) {
                Integer getcalculate = count / 20;
                log.info("1. page count ::: " + getcalculate);
                return getcalculate;
            }
            if (calculate <= 1) {
                Integer getcalculate = count / 20;
                getcalculate++;
                log.info("2. page count :::" + getcalculate);
                return getcalculate;
            }
        } catch (Exception e) {
            log.info("∆exception raised ::: " + e.getMessage());
            return -100;
        }
        return 1;
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
