@regression @smoke @us-248 @E2E
Feature: Ebay Cart Functionality

Description: User should able to add items in cart

	Background: 
		Given Open Ebay Homepage
	
	Scenario: Ebay cart functionality
		Given Search for Big Tall Cotton Tee
		When Select the first shirt on item list
		And Select Size
		And Select Men Size
		And Select Shade
		And Select Quantity
		Then Add to shopping cart