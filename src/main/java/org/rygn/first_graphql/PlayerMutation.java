package org.rygn.first_graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;

public class PlayerMutation implements GraphQLMutationResolver {
	
	private PlayerDao playerDao;

    public PlayerMutation(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public Player writePlayer(String id, String Nom, String Prenom) {
    	
    	Player player = new Player();
        player.setId(id);
        player.setNom(Nom);
        player.setPrenom(Prenom);
    	
        return playerDao.savePlayer(player);
    }
}