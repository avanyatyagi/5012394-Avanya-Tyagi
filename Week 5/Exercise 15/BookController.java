public class BookController {
    import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@GetMapping("/{id}")
@Operation(summary = "Get a book by its ID")
@ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Found the book"),
    @ApiResponse(responseCode = "404", description = "Book not found")
})
public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
    // Logic to retrieve book (not implemented)
    return new ResponseEntity<>(new BookDTO(id, "Sample Title", "Sample Author", 29.99), HttpStatus.OK);
}

}
