Feature: Login page for Ajio site

Scenario: Login with validate product name same or not
Given Open Browser 
And Launch Url
When MouseHover on Home and Kitchen
And Click on Serveware & Drinkware (under Dining)
And Click on Any Product & get the product name
And  Click on Add To Bag
And Click on Mini Bag
Then In ShoppingBag, Validate product name same or not
