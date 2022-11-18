package io.tigerbase.app.repository;

import io.tigerbase.app.object.Board;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository  extends PagingAndSortingRepository<Board,String> {


}
