package com.everyme.global.swagger.controller;

import com.everyme.global.swagger.dto.Tutorial;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Tutorial", description = "Tutorial management APIs")
@RestController
@RequestMapping("/api")
public class MemberController {

//    @GetMapping("/users")
//    public String getUsers() {
//        return "result";
//    }

    @Operation(
            summary = "요놈이 뭐하는 놈인지 적는다",
            description = "자세한 설명을 적는다",
            tags = { "tutorials", "get", "그루핑" })
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Tutorial.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping("/test1/{id}")
    public ResponseEntity getTutorialById(@PathVariable("id") long id) {

        return ResponseEntity.ok(id);

    }
}
