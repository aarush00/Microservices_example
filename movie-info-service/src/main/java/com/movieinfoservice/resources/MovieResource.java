package com.movieinfoservice.resources;

import com.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @RequestMapping(value = "/{movieid}",method = RequestMethod.GET)
    public Movie getMovieInfo(@PathVariable String movieid){
        return new Movie("69","Test_koimilgya");
    }

}
