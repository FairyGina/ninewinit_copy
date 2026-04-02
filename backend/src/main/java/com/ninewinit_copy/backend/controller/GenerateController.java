package com.ninewinit_copy.backend.controller;

import com.ninewinit_copy.backend.dto.GenerateRequest;
import com.ninewinit_copy.backend.dto.GenerateResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class GenerateController {

    @PostMapping("/generate")
    public GenerateResponse generate(@RequestBody GenerateRequest request) {
        return new GenerateResponse(
                "URL을 정상적으로 받았습니다.",
                request.getUrl()
        );
    }
}