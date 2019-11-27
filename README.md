# Android-Course-First-Assignment

You are going to build a football game service which clients can use to get the fixtures (upcoming matches) and the results of football matches. Specifications:

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

Assumptions:
The clients of this system know the teams and tournaments it supports
The data in the Data origin has a known format and is valid.
The matches input file path can be hard coded to the example input file path and
No need to handle concurrency concerns.
No Ul is required.
All of the service responses will be in json format.
No persistence required.
