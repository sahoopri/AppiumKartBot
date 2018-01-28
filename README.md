
Appium Project
==========
## Testing a Mobile App Login & Registration using Appium.

## Objective

Intent of this project is to illustrate how **Appium** can be used to test mobile application **Android** and parallelise the test with multiple android devices connected.

## This project illustrate below concepts:

## Android App Tests
This is is to practice precisely how to get started with Android App testing, write the first test and then the test suite management.

This java project has been created using **IntelliJ IDea 13 Community Edition**. **Maven** POM File manages the dependency of **Selenium (version 3.0.1)**. Project is using **TestNG annotation**. I have also bundled the respective mobile applications under the apps folder for ease.

## Steps:

- **Appium Set up** - Before running the project you need to download and install Appium. Once this this done, do the android SDK set up as mentioned below.
* Install XCode
* Install NodeJS : [brew install node]
* Install Android Studio 
* Download and Install Appium Server & Client 
[npm install -g appium-doctor --ios or --android ] depending on which platform
[npm install -g appium ]
[npm install webdriverio ] or [npm install -g --save webdriverio] 

- **Android SDK Set up** - Download Android SDK, & set up the path appropriately. Create virtual devices. Once the virtual devices are created, 

- **Launch Appium Server** and start the emulator accordingly.
Appium server by default starts at port no : 4723 

To start the server use:

[appium] or [appium -p <portno>] -p is to change the port no. 

Or 

Click the **Start Server** button inside the Appium server desktop client.

- **Clone this repository**  [git clone <Ripo URL>]

- **Open the solution**
* Use IntelliJ IDEA

- **Rebuild**     
* Build the test

- **Run the test**  
* Use IntelliJ IDEA
* Build the test
* Make sure a device/emulator is connected 
* Run the server, then Run the test.




