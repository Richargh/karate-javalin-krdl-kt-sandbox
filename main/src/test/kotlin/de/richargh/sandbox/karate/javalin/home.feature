Feature:

  Scenario: Fetch Homepage
    Given url 'http://localhost:3000'
    And header Accept = 'text/html'
    When method GET
    Then status 200
    And match //h1 == "Home"