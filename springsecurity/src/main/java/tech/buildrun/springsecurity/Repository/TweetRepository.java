package tech.buildrun.springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.springsecurity.Entities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
