package project.pagination.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.pagination.constants.Constants;
import project.pagination.dao.Gallary;
import project.pagination.mapper.PaginationMapper;

@Service
@RequiredArgsConstructor
@Slf4j
public class CursorPaginationService {

    private final PaginationMapper paginationMapper;


    public List<Gallary> getGallery(Integer cursor) {

        return paginationMapper.cursorPagination(cursor, Constants.TAKE);
    }


}
