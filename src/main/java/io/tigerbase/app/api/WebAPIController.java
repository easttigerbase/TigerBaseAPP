package io.tigerbase.app.api;

import io.tigerbase.app.object.Board;
import io.tigerbase.app.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(value = "api/v1")
public class WebAPIController {

    @Autowired
    BoardRepository boardRepository;

    @PostMapping(value = "/board",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Board> postBoard(@RequestBody Board board,@RequestParam String type){
        System.out.println("board = " + board.toString());

        boardRepository.save(board);
        return new ResponseEntity<Board>(board,HttpStatus.OK);
    }

    @GetMapping(value = "/board")
    public ResponseEntity<Object> getAllBoard(@RequestParam String type){
        System.out.println(boardRepository.findAll()+type);
        return new ResponseEntity<Object>(boardRepository.findAll(),HttpStatus.OK);
    }

    @GetMapping(value = "/board/{id}")
    public ResponseEntity<Object> getBoard(@PathVariable String id){
        return new ResponseEntity<Object>(boardRepository.findById(id),HttpStatus.OK);
    }

}
