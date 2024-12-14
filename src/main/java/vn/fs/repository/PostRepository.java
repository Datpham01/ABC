package vn.fs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.fs.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
