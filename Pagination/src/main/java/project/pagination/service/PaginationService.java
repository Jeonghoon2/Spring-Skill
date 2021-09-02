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

    /* 모든 그림 개수 세아리기 */
    public Integer gallerycount(){

        try {
            Integer count = paginationMapper.gallerycount();
            log.info("count value ::: " + count.toString());
            return count;
        } catch(Exception e) {
            log.info("exception raised ::: " + e.getMessage());
            return -100;
        }
    }

}
