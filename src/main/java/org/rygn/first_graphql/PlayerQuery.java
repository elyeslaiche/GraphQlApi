package org.rygn.first_graphql;

import java.util.List;

import graphql.kickstart.tools.GraphQLQueryResolver;


public class PlayerQuery implements GraphQLQueryResolver {

    private PlayerDao playerDao;

    public PlayerQuery(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    public List<Player> recentPlayers(int count, int offset) {
        return playerDao.getrecentPlayers(count, offset);
    }
}
