Feature:

  Background:
    * configure driver = { type: 'geckodriver' }

  Scenario: Look at more Kebab
    Given driver myUrlBase + 'kebab'
    When click('a[id=more]')
    Then waitForUrl(myUrlBase + 'kebab/more')

  Scenario: Look at less Kebab
    Given driver myUrlBase + 'kebab/more'
    When click('a[id=less]')
    Then waitForUrl(myUrlBase + 'kebab')