package org.rygn.first_graphql;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerDao {

	private List<Player> Players;

    public PlayerDao(List<Player> players) {
        this.Players = players;
    }

    public List<Player> getRecentPlayers(int count, int offset) {
    	
    	return this.Players.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

	public Player savePost(Player post) {
		
		this.Players.add(post);
		
		return post;
	}
}
