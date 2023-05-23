package org.rygn.first_graphql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

	@Bean
    public PlayerDao playerDao() {
        List<Player> players = new ArrayList<>();
        for (int postId = 0; postId < 10; ++postId) {
            Player player = new Player();
            player.setId("" + postId);
            player.setPrenom("Prenom " + postId);
            player.setNom("Nom " + postId);
            players.add(player);
        }
        return new PlayerDao(players);
    }
	
	@Bean
	public TeamDao teamDao() {
		
		List<Team> teams = new ArrayList<>();
		
		Team team1 = new Team();
		team1.setId("FRA");
		team1.setName("France");
		teams.add(team1);
		
		Team team2 = new Team();
		team2.setId("SP");
		team2.setName("Spain");
		teams.add(team2);
		
		return new TeamDao(teams);
	}
	
	@Bean
    public PlayerQuery blogQuery(PlayerDao playerDao) {
        return new PlayerQuery(playerDao);
    }
	
	@Bean
    public TeamsQuery teamsQuery(TeamDao teamDao) {
        return new TeamsQuery(teamDao);
    }
	
	@Bean
    public PlayerMutation mutation(PlayerDao playerDao) {
        return new PlayerMutation(playerDao);
    }
}
