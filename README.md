Project Background

This is an automation project that navigates to UniversalMediaPlayer android application 

- Firstly it launches the UniversalMediaPlayer 
- It's then going to select and play a specific track
- The track will play for 5 seconds then closes the app

Functionality
- I created a method called PlayMusic that will get and action all the elements
- Under Test_Mobile class I created 4 action methods:
   1. Select_Genre method that will be responsible to click genre once the app is loaded
   2. Select_Rock method will be responsible to select the rock genre from the list 
   3. Play_Song method that will be responsible to play select track
   4. Closer_Player method that will close the app once all the actions have completed

How to run the tests
Expand Tests >> right click and run Test_Mobile class
Then wait until the tests finishes running the confirm they all passed
