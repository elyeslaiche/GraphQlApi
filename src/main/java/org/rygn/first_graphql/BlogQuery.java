package org.rygn.first_graphql;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;


public class BlogQuery implements GraphQLQueryResolver {

    private PlayerDao playerDao;

    public BlogQuery(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public List<Player> getRecentPosts(int count, int offset) {
        return playerDao.getRecentPlayers(count, offset);
    }
}
