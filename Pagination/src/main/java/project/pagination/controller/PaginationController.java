package project.pagination.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.pagination.dao.ResponseDto;
import project.pagination.service.CursorPaginationService;
import project.pagination.service.PaginationService;

@Slf4j
@RestController
@RequestMapping("/api/pagination")
public class PaginationController {

    @Autowired
    PaginationService paginationService;

    @Autowired
    CursorPaginationService cursorPaginationService;

    @GetMapping("/cursor/{cursor}")
    public ResponseEntity cursorPagination(@PathVariable("cursor") Integer cursor){
        return new ResponseEntity(
            ResponseDto
                .builder()
                .data(cursorPaginationService.getGallery(cursor)) // 네네
                .build()
            , HttpStatus.OK
        );
    }

    @GetMapping("/gallerycount")
    public Integer galleryCount() {
        Integer count = paginationService.gallerycount();
        return count;
    }

    @GetMapping("countgallerypage")
    public Integer gallerypage() throws Exception {
        Integer pageNum = paginationService.gallerycountpage();
        return pageNum;
    }

    //feedback

}
