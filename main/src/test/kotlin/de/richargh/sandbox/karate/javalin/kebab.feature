Feature:

  Background:
    * configure driver = { type: 'geckodriver' }

  Scenario: Look at more Kebab
    Given driver 'http://localhost:3000/kebab'
    When click('a[id=more]')
    Then waitForUrl('http://localhost:3000/kebab/more')

  Scenario: Look at less Kebab
    Given driver 'http://localhost:3000/kebab/more'
    When click('a[id=less]')
    Then waitForUrl('http://localhost:3000')