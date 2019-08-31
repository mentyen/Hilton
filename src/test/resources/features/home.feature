#Author: your.email@your.domain.com

@sprint1
Feature: Title of your feature
  I want to use this template for my feature file

  @smoke
  Scenario: Testing  search functionality
  Given Im on a main page
  And I enter "Los" in to a search  and choose Los Angelos from a drop down
  And I click on a calendar and choose arriving and return dates
  Then I choose 3 adults in a Room section
  And I click on a Find Hotel
  And I Verify that number of avalible is "42"

