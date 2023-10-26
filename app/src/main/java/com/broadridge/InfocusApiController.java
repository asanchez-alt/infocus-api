package com.broadridge;

import io.micronaut.http.annotation.*;

@Controller("/infocus-api")
public class InfocusApiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}