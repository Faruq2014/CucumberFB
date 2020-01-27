# tag befor feature will run whole class
@system 
Feature: Testing cucumber functionality
  I want to use this template for my feature file
  # tag befor scenario will run only that scenario.
@smoke
  Scenario: Testing facebook hook
    Given open facebook 
    When enter invalid username and invalid password
    Then should be land on forget page
 @functional
  Scenario: Testing yahoo hook
    Given open yahoo on chrom
    When click on signup button
    Then signup page should open
 @regressional
  Scenario: Testing google hook
    Given open google and start application
    When enter cucumber tag on search button
    Then should land on serch page
@functional @regressional
  Scenario: Testing ebay hook   #amazon
    Given open amazon application
    When click on todays deal
    Then should land on serch todays page.
 @sanity
  Scenario: Testing ebay hook
    Given open ebay application
    When click on login link deal
    Then should land on serch login page.
