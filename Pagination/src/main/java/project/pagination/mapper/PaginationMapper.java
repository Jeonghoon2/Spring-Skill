package project.pagination.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import project.pagination.dao.Gallary;

@Mapper
public interface PaginationMapper {

    List<Gallary> indexPageination(
        @Param("skip") Integer skip
        ,@Param("take") Integer take
    );

    List<Gallary> cursorPagination(
        @Param("cursor") Integer cursor
        ,@Param("take") Integer take
    );

    Integer gallerycount();
}
