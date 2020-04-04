package com.ratingdataservice.resource;


import com.ratingdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingResource {
    @RequestMapping(value = "/{movieid}",method = RequestMethod.GET)
    public Rating getRating(@PathVariable String movieid){
        return new Rating(movieid,2);
    }
}
