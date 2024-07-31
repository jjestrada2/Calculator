# Design patterns within the object-oriented programming paradigm Calculator👾


## Project Overview🤗
The technical overview of this project involves completing a software application using the principles of object-oriented design. The software follows a hierarchical structure, utilizing various classes to implement different functionalities and ensure code organization and reusability. The project aims to adhere to best practices and design patterns within the object-oriented programming paradigm.
Additionally, the project includes developing a graphical user interface (GUI) for the software. The GUI is designed with a user-friendly interface, considering aspects such as layout, aesthetics, and ease of interaction. Attention is given to proper user experience design principles, ensuring that the software is intuitive and easy to navigate for users.

## Summary of Work Completed🙌
To get the assignment working correctly, I made the following contributions:
1. Completed the abstract class "Operator" by creating a HashMap to store the operators' string values as keys and their respective initialization class as their value. This allowed for efficient retrieval and identification of operators.
2. Implemented the static methods of the abstract Operator class, such as "getOperator" and "check." These methods facilitated the validation and retrieval of operators based on the given expression.
3. Created subclasses of the abstract class "Operator" and implemented the corresponding abstract methods, such as "priority" and "execution." This allowed for defining the specific behavior and priority of each operator.
4. Completed the Operand class by adding its corresponding attribute (value), constructor, and methods like "getValue" and "check." This class provided the necessary functionality to represent and manipulate operands in the expression.
5. Implemented the user interface by completing the actionPerformed method. I added multiple conditional statements to handle different button clicks and provide the required functionality. For example, I enabled the erasure of text when the user pressed "C" or "CE," evaluated the expression when "=" was pressed, and concatenated characters by default when the button represented an operand or operator.
6. Addressed the evaluator class, which presented the most challenging part of the assignment. I fixed the initialization of the newOperator object and implemented an "if-else" conditional to handle parentheses operators and operands. I ensured the proper order of pushing them onto their respective stacks. Additionally, I created a while loop to process the operatorStack and operandStack, performing the necessary mathematical calculations to obtain the final result of the expression.# Adding the JUnit 5 Jars to your project.

## Build/Import Project🎮
1. In your terminal type: git clone (https://github.com/jjestrada2/Calculator.git) Please clone your repo to a folder on your compute that does not require elevated privileges.
2. Open your preferred IDE (Integrated Development Environment) such as Eclipse, IntelliJ IDEA, or NetBeans.
3. Select import project.
4. Select the Calculator folder as the source root of the project
5. Keep the “Create project from existing resources” radio button selected
6. All default fields can be left alone here.
7. Now, you can build the project by selecting the "Build" or "Compile" option from the IDE's
menu. This will compile the Java source code files into bytecode and generate the necessary class files.

## Run Project🏋️
After the project is successfully built, you can run the calculator application by locating the main class (in this case, EvaluatorUI.java) and right-clicking on it. Choose the "Run" or "Debug" option from the context menu. The calculator application should now launch and display the graphical user interface (GUI), allowing you to input mathematical expressions and evaluate them.

### InteliJ🦸‍♂️
In order to use the Unit tests given you will need to let intelij know where to find the needed jars. (jars are just java version of an archived folder or zip file.). 

Intelij will actually find these jars for you while imporiting the project.

If for some reason it does not, you can add the jars in the following way:

1. Complete the process for "create project from existing resources"
2. Then go to File -> Project Structure.
3. Inside project Structure select the "Libraries" tab on the left.
4. You will see a "+" symbol near the top of the window. CLick this symbol.
5. A little window will popup asking what kind of library you want to import. Select "jar"
6. After selection jar, a file selector will appear, navigate to the folder calcualtor/src/test/resources
7. Add ALL jars in this folder. Then hit OK/Accept until all windows for project structure are closed.
8. Now all jar needed to run unit test should be attached to your project.
9. To run unit tests you can simply select any of the files in test/java. Also you may right-slick on the java folder inside test and select run all tests to run all given unit tests.

## Contributing🙇‍♂️

If you would like to contribute to this project, please fork the repository and create a pull request with your changes. Contributions are always welcome!

## License📜

This project is licensed under the MIT License - see the [LICENSE](https://choosealicense.com/licenses/mit/) file for details.

## Credits🔥

- [Juan Estrada](https://github.com/jjestrada2) - Developer of this project.

## Contact🦻

For support or inquiries, please contact [Juan Estrada](mailto:juan5801331@gmail.com).

