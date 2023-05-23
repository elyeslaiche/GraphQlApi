# GraphQL Python Client

This project is a simple Python client for consuming a GraphQL API.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine.

### Prerequisites

- Python 3.6 or later: If you don't have Python installed, you can download it from [here](https://www.python.org/downloads/).
- pip: This is the package installer for Python. It comes installed with the newer Python versions.

### Cloning the project

1. Navigate to the directory where you want to clone the project.
2. Open a terminal or command prompt in this directory.
3. Run the following command:

\`\`\`
git clone https://github.com/elyeslaiche/GraphQlApi.git
\`\`\`

### Setting up the environment

After cloning the project, navigate into the project directory:

\`\`\`
cd GraphQlApi
\`\`\`

Next, you need to install the necessary Python libraries. You can do this by running:

\`\`\`
pip install requests
\`\`\`

### Running the application

To run the application, navigate to the directory where `Client.py` is located (the src folder) and run:

\`\`\`
python Client.py
\`\`\`

## Usage

This client provides three main functions:

- `get_recent_players(count: int = 100, offset: int = 0)`: Fetches the recent players from the GraphQL API.
- `get_all_teams()`: Fetches all teams from the GraphQL API.
- `write_player(id: str, Nom: str, Prenom: str)`: Writes a new player to the GraphQL API.

## License

This project is licensed under the MIT License.
