package org.rygn.first_graphql;

import graphql.kickstart.tools.GraphQLMutationResolver;

public class BlogMutation implements GraphQLMutationResolver {
	
	private PlayerDao playerDao;

    public BlogMutation(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public Player writePost(String id, String Nom, String Prenom) {
    	
    	Player player = new Player();
        player.setId(id);
        player.setNom(Nom);
        player.setPrenom(Prenom);
    	
        return playerDao.savePost(player);
    }
}