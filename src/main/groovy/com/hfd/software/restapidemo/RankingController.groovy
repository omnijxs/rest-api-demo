package com.hfd.software.restapidemo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by jxs on 28.1.2018.
 */
@RestController
class RankingController {

    @RequestMapping(value = "/ranking", method = RequestMethod.GET, produces ="application/json")
    public def list() {
        Competitor c_1 = new Competitor(label: "Harry Guizmo", rating: "1100")
        Competitor c_2 = new Competitor(label: "Esaiah Johnson", rating: "1050")
        Competitor c_3 = new Competitor(label: "Jake Leafey", rating: "1000")
        return [c_1, c_2, c_3]
    }
}
