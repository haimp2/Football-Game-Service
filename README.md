# Football-Game-Service


A team has a unique ID and a name.
A tournament has a unique ID and a name
A match has a status
An upcoming match has 2 teams start_date, kickoff time and a tournament.
A finished game has 2 teams, start_date, a tournament and a score.
The data for the matches is available from the attached text files (aka Data origin, result_upcoming.csv, resultplayed.csv).
A match status can either be 'upcoming" or "played".

Implement a restful api service with the following features:
Get list of matches by team.
Get list of matches by team filtered by status
Get list of matches by tournament.
Get list of matches by tournament filtered by status
