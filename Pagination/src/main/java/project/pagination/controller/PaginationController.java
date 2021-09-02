package project.pagination.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.pagination.service.PaginationService;

@Slf4j
@RestController
@RequestMapping("/api/pagination")
public class PaginationController {

    @Autowired
    PaginationService paginationService;

    @GetMapping("/gallerycount")
    public Integer galleryCount(){

        try{
            Integer count = paginationService.gallerycount();
            return count;
        }catch (NullPointerException e){
            log.debug(e.getMessage());
            return -100;
        }catch (Exception e){
            log.debug(e.getMessage());
            return -200;
        }
    }
}
