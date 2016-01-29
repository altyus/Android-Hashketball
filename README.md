

# Hashketball

### Skills: Hashmaps and Iteration

## Instructions

Great news! You're going to an NBA game! The only catch is that you've been volunteered to keep track of some information about the teams and players.  

Using Nested HashMaps, define a game, with two teams, their players, and some player info:

* The game has two teams
* A team has:
  * name
  * colors (x2)
* Each player should have a:
  * name
  * jersey_number
  * shoe_size

Use the following seed data to structure the hashmaps.  Use the Test spec to make sure you're putting things in the correct order. Think about how you might be accessing the data when designing your nested hashmap structure.

* Home Team = Brooklyn Nets, Colors = Black, White
* Away Team = Chicago Bulls, Colors = Black, Red

| **Name**           | Deron Williams| Brook Lopez  | Paul Pierce  | Kevin Garnett | Reggie Evans  |
|:------------------:|:-------------:|:------------:|:------------:|:-------------:|:-------------:|
| **Team**           | Brooklyn Nets | Brooklyn Nets| Brooklyn Nets| Brooklyn Nets | Brooklyn Nets |
| **Number**         | 8             | 11           | 34           | 2             | 30            |
| **Shoe**           | 13            | 20           | 15           | 15            | 14            |



| **Name**           | Joakim Noah   | Jimmy Butler | Kirk Hinrich | Carlos Boozer | Mike Dunleavy |
|:------------------:|:-------------:|:------------:|:------------:|:-------------:|:-------------:|
| **Team**           | Chicago Bulls | Chicago Bulls| Chicago Bulls| Chicago Bulls | Chicago Bulls |
| **Number**         | 13            | 21           | 12           | 5             | 34            |
| **Shoe**           | 23            | 15           | 13           | 18            | 12            |


Using the power of Java, and the hashmaps you created, write methods to complete the following:

1. Returns your game hashmap. Call the method `getBasketballGame()`.

2. Return the shoe size for any player, given that player's name. Call the method `shoeSize(String name)`.

3. Return both colors for any team, given the team name. Call the method `teamColors(String name)`.

4. Return both teams names, given the game hashmap. Call the method `teamNames()`. Note: Since you have a method `getBasketballGame()` that
returns your hashmap, there is no need to pass it in as an argument! You can just call it from within your `teamNames()` method.

6. Return all the player numbers for a team, given a team name. Call the method `playerNumbers(String name)`.


**Bonus Question:**

Define a method to return the answer to the following question:

1. Which player has the longest name? Call the method `playerWithLongestName()`.

## Resources
* [Udemy](https://www.udemy.com/java-tutorial/#/lecture/161682)
<p data-visibility='hidden'>View <a href='https://learn.co/lessons/Android-Hashketball' title='Hashketball'>Hashketball</a> on Learn.co and start learning to code for free.</p>
