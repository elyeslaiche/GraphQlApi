import requests
import json

GRAPHQL_ENDPOINT = "http://localhost:8080/graphql"

def execute_query(query: str, variables: dict = None):
    headers = {'Content-Type': 'application/json'}
    data = {"query": query, "variables": variables}

    response = requests.post(GRAPHQL_ENDPOINT, headers=headers, json=data)

    if response.status_code == 200:
        return response.json()
    else:
        raise Exception(f"Query failed to run with a {response.status_code}. {response.text}")

def get_recent_players(count: int = 100, offset: int = 0):
    query = """
    query GetRecentPlayers($count: Int, $offset: Int) {
        recentPlayers(count: $count, offset: $offset) {
            id
            Nom
            Prenom
        }
    }
    """
    variables = {"count": count, "offset": offset}
    return execute_query(query, variables)

def get_all_teams():
    query = """
    query {
        allTeams {
            Id
            Name
        }
    }
    """
    return execute_query(query)

def write_player(id: str, Nom: str, Prenom: str):
    mutation = """
    mutation WritePlayer($id: String!, $Nom: String!, $Prenom: String!) {
        writePlayer(id: $id, Nom: $Nom, Prenom: $Prenom) {
            id
            Nom
            Prenom
        }
    }
    """
    variables = {"id": id, "Nom": Nom, "Prenom": Prenom}
    return execute_query(mutation, variables)


if __name__ == "__main__":
    print(get_recent_players(count=20, offset=0))
    print(get_all_teams())
    print(write_player("123", "Smith", "John"))
