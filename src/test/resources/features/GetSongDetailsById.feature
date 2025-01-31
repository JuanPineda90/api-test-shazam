Feature: Get song details

  Scenario: Get details of a song by existing ID
    When a song is consulted
    |id        |
    |1217912247|
    Then I can see the song information