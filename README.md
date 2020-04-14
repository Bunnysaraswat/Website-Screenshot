# Website-Screenshot
Take screenshot of full website automatically.

Prerequisite:
1) Java version 8 or above.
2) Eclipse.
3) Selenium Chrome Driver(or driver of whichever browser you want to use)
4) Selenium drivers for java.

Setting up the project:
1) Clone this repo.
2) Open Eclipse and make a new workspace.
3) Import Maven Project.
4) Choose the cloned folder and click OK.
5) Configure build path and add java path (Make sure you are using JDK instead of JRE)
6) In Configure Build path, click on " Add External Jars " and then select all files in folder where you have installed Selenium drivers for Java.
7) After adding External Jar's, make sure they are installed by checking them in Referenced Libraries folder.
8) Refresh The project.
9) Right Click on Project and hover on Run As, then select Maven Install.

Starting the project:
1) Navigate to AjackusMavenProject --> src/main/java --> Screenshot.AjackusMavenProject --> ScreenShot.java
2) Change the path of chrome driver at line number 21 (if you're using any other browser than give the path of that browser's driver installation directory)
3) After that, change the website url at line number 25 to the url of the website whose screenshot you want to take.
4) Now, change the path of folder where you want to save your captured images at line number 32.
5) Also initialize the name of image in the path itself.
6) Now, refresh the project.
7) Right click on ScreenShot.java --> Run As --> Java Application.

Result:
1) Wait for file to run.
2) You'll see that browser will open and that website will open.
3) You'll notice a pop-up saying that this is being controlled by automated tool and website will start scrolling automatically (If it is a scrollable website)
4) Now, check the folder which you've initialized. Image would be saved there.

Thanks!!
