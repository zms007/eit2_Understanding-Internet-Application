# eit2_Understanding-Internet-Application
Practical 2 Understanding Internet Application

1.1  	Description
Having the computer connected to Internet has little use because we need to use application to communicate with each other and there are multiple ways for computers to communicate depends on the medium that we needed. We can communicate via text, image, audio and videos. It depends on the needs of our application; we can use different application. In addition to that, it also depends on how many parties that needed to be connected. In this lab, we will show some useful internet applications that are useful for our daily operation.  

1.2  	Lab Objective(s)
To understand different type of data for internet communication.
To explore different internet application for computers.
To share information across the internet.  

1.3  	Grouping Method
This lab guide is to be completed in a pair.

1.4  	Lab Environment
For this lab, we will be using Windows 10 operating system and 
Ubuntu 20.04 LTS.  

1.5  	Task
1.5.1  	Connecting multiple computers for sharing text communication 
1. 	First, we need to have the following programs. The programs are written in Java therefore we need to compile them using a JDK before we can make use of them. 

  https://github.com/zms007/eit2_Understanding-Internet-Application/blob/main/Client.java
  https://github.com/zms007/eit2_Understanding-Internet-Application/blob/main/Server.java

2. 	Download all the JDK from the following website. 

https://www.oracle.com/java/technologies/downloads/

Click on the download JDK client (choose x64 Installer). 

 
3. 	Install the JDK client.

4. 	Compile the program with the following command.

C:\Users\user> javac client.java
C:\Users\user> javac -Xlint server.java

5. 	At the server, run the program with the following program. 

C:\Users\user> java server
 

6. 	At the server, open a new command prompt and run the client program. 

C:\Users\user> java client
 

7. 	At the client computer, open a new command prompt and run the client program. 

C:\Users\user> java client
 

8. 	You can start chatting with the program. 


