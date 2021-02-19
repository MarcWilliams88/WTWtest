@FeatureBrowser
Feature: Willis Towers Watson Test

@ScenarioBrowser
Scenario: Test browser
    Given Browser is open
    And User is on homepage
    When Check sorting
    And Filter
    Then Validate Article
  
