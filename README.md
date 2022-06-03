# Game2D
Easy to use, and simplistic API to start your 2D game-development #JAVA


## Getting started
- Download the Game2D.jar
- Open your installed IntelliJ IDEA Project and go to the File > Project Structure
- Select Modules at the left panel and select the Dependencies tab
- Select the + icon and select 1 JARs or Directories option
- Select your JAR file or you can select the directories. And click on the OK button
- After selecting your JAR file click on the OK button, and you are done

[Click here](https://www.geeksforgeeks.org/how-to-add-external-jar-file-to-an-intellij-idea-project/) for a more detailed guide on how to add a JAR file to your project

## Using Game2D
To create an empty gameFrame, and run the gameLoop add the following lines of code to your main method:
```
GamePanel gamePanel = new GamePanel();
GameFrame gameFrame = new GameFrame(400, 200, "MyGame", gamePanel);

gamePanel.runGame();
```

For the full documentation see [Javadocs](.src/javadoc/index.html)
