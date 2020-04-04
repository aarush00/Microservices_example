package com.moviecatalogservice.resource;


import com.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

        @RequestMapping("/{userid}")
        public List<CatalogItem> getCatalog(@PathVariable String userid){
            return Collections.singletonList(
                    new CatalogItem("koI MIL gYA","hadd bekar",-5)
            );

        }
}
