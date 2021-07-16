
@AppFeatures
Feature: App Testing
  I want to test different challenges using The-Internet heroku app

  @Add_Elements
  @SmokeTest2
  Scenario: Add some elements
    Given I want to add some elements
    When I click the add elements button twice
    Then two elements are added
    
  @Remove_Elements
  @SmokeTest2
  Scenario: delete some elements
    Given I want to delete some added elements
    When I click the delete button on each element
    Then the elements are removed
    
  @Basic_Auth_Pass
  Scenario: gain basic authorization
    Given I want to gain authorization
    When I give the correct creds through the http req
    Then i am given authorization
    
  @Basic_Auth_Fail
  Scenario: gain basic authorization
    Given I want to gain authorization
    When I give incorrect creds through the http req
    Then i am not given authorization
    
  @Broken_Imgs
  Scenario: check for broken images
    Given I want to check for broken images
    When I make a list of images
    And check them for broken images
    Then there are no broken images
    
  @Checkboxes_Default
  Scenario: working with checkboxes
    Given I want to work with checkboxes
    When I check the default settings
    Then the first box is not enabled
    And the second box is enabled
    
  @Checkboxes_Editted
  Scenario: working with editted checkboxes
    Given I want to work with editted checkboxes
    When I change the default settings for each box
    Then the first box is enabled
    And the second box is not enabled
    
  @Context_Menu_Right_Click
  Scenario: working with context menus
    Given I want to access the context menu
    When I right click the context menu
    Then the context menu is accessed
    
  @Disappearing_Elements
  Scenario: checking disappearing elements
    Given I want all elements to be there
    When I check if the elements are there
    Then all elements are present
    
  @Drag_And_Drop
  Scenario: checking if I can drag and drop
    Given I want to drag and drop A to B
    When I drag and drop A to B
    Then A and B switch spots

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
