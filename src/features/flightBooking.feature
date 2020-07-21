Feature: Title of your feature
  I want to use this template for my feature file

  @testRun
  Scenario Outline: Title of your scenario outline
    Given I open flight booking website
    And I book ticket from "<fromCity>" to "<toCity>"

    Examples: 
      | fromCity                                         | toCity                                 |
      | Hyderabad, IN - Rajiv Gandhi International (HYD) | Visakhapatnam, IN - Vishakhapatnam (VTZ) |
