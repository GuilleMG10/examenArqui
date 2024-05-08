package ucb.com.prueba_ucb;

import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

public interface LoginResponse {

    @Tag(name = "Login", description = "Endpoint to authenticate a user")
    @Operation(summary = "Authenticate user")
    @ApiResponses(
        value = {
            @ApiResponse(
                responseCode = "200", 
                description = "User successfully authenticated",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = LoginResponse.class))
                }
            ),
            @ApiResponse(
                responseCode = "400", 
                description = "Invalid request body",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))
                }
            ),
            @ApiResponse(
                responseCode = "401", 
                description = "Unauthorized",
                content = {
                    @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponse.class))
                }
            )
        }
    )
}
