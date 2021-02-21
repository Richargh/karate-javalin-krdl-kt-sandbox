Feature:

  Scenario: Fetch Car
    Given url 'http://localhost:3000/car'
    And header Accept = 'application/json'
    When method GET
    Then status 200
    And match $[0] == {id: "1", model: "101", brand:"Cyberdyne"}