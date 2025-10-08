[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

SOFTWARE DESIGN AND ARCHITECTURE ASSIGNMENT 2

Group 3

CRN: 45740

Jayden Mallari (100927861)

Rabab Raza (100932792)

Contribution Matrix:

Jayden Mallari:
- Question 2
- Scanner Modification of Question 3 (ScannerForApp)
- Sequence diagram in question 4

Rabab Raza:
- Question 1, Java Swing Class Diagram
- Question 3 Cash Register code following MVC pattern
-    CashRegister,
-    Display,
-    Control classes



1. The Swing Framework is a component of the Java standard library utilized to implement Graphical User Interfaces (GUIs) for desktop applications. It provides an assortment of lightweight components such as buttons, labels, text fields, tables, and panels that can be styled and positioned as per different layouts and appearances. Swing follows the Model-View-Controller (MVC) pattern to separate data (Model), user interface (View), and user action logic (Controller) in order to make applications easier to manage and extend.

Java Swing Class Diagram

<img width="1566" height="992" alt="image" src="https://github.com/user-attachments/assets/4ee181ea-2149-478b-b607-6b3db6ad5669" />

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

2. The MVC pattern aims to separate information, presentation, and user interaction with the system. It is divided into three categories: models, views, and controllers. When an object state in the model changes, that notification is sent to the view so that it can be updated, and to the controller so that it can modify the view if the logic permits it. 

   The provided example code implements a simplified version of the MVC pattern. The Model class contains the application data (firstname and lastname) and provides getter/setter methods for data access to other classes. The View class assembles the GUI of the applications and contains no business logic. The Controller class provides functionality to the UI with event listeners to respond to user interactions (i.e., Save firstname, Save lastname, Hello!, and Bye!). It also acts as a mediator between the Model and View classes. The Model is updated when data is saved. The MySwingMVCApp class puts everything together by creating the Model, View, and Controller objects and runs the application. The Scanner class emulates scanning an item; however, it is not integrated into the MVC pattern.

   This differs from how MVC was described in the lectures in several ways. Firstly, the Controller in this program carries out tasks that would otherwise be executed by the View, such as using JOptionPane to display output messages to the user. Traditional MVC dictates that the Controller should strictly handle user input while the View handles the output. Secondly, this Model component does not notify the View or Controller when state changes, unlike normal MVC. For changes in the Model to appear in the View, the Controller must manually refresh the interface. Lastly, the Scanner class is not incorporated into the main MVC structure, functioning more as a supplementary class, filling a niche purpose rather than being part of the MVC interaction.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

4. Sequence Diagram for Cash Register MVC
   <img width="2394" height="1297" alt="image" src="https://github.com/user-attachments/assets/4bfee0fb-4b63-4009-b167-f5f4cdd3f1b3" />


   
