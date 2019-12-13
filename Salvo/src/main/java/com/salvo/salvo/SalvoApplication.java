package com.salvo.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

        public static void main(String[] args) {
                SpringApplication.run(SalvoApplication.class, args);
        }

        @Bean
        public CommandLineRunner initData(PlayerRepository playerRepository, GameRepository gameRepository, GamePlayerRepository gamePlayerRepository) {
                return (args) -> {
                        Player player1 = new Player("sil", "Silvana", "Gutierrez", "silvanagriseldagutierrez@gmail.com");
                        playerRepository.save(player1);

                        Player player2 = new Player("juli", "Julia", "Prebisch", "chilolomas@hotmail.com");
                        playerRepository.save(player2);

                        Player player3 = new Player("nico", "Nicolas", "Schain", "nicoschain@gmail.com");
                        playerRepository.save(player3);

                        Player player4 = new Player("estefy", "Estefania", "Vitale", "estefivitale@yahoo.com.ar");
                        playerRepository.save(player4);

                        Game game1 = new Game();
                        gameRepository.save(game1);

                        Game game2 = new Game();
                        gameRepository.save(game2);

                        Game game3 = new Game();
                        gameRepository.save(game3);

                        GamePlayer gamePlayer1 = new GamePlayer(player1, game1);
                        gamePlayerRepository.save(gamePlayer1);
                        GamePlayer gamePlayer2 = new GamePlayer(player2, game1);
                        gamePlayerRepository.save(gamePlayer2);
                        GamePlayer gamePlayer3 = new GamePlayer(player3, game2);
                        gamePlayerRepository.save(gamePlayer3);
                        GamePlayer gamePlayer4 = new GamePlayer(player4, game2);
                        gamePlayerRepository.save(gamePlayer4);
                        GamePlayer gamePlayer5 = new GamePlayer(player1, game3);
                        gamePlayerRepository.save(gamePlayer5);
                        GamePlayer gamePlayer6 = new GamePlayer(player3, game3);
                        gamePlayerRepository.save(gamePlayer6);

                        String[] arrays={""}

                };
        }
}
