# Chat Application using Java
<p>This is a simple chat application developed in Java that uses socket programming to enable communication between a server and multiple clients. The application features a graphical user interface (GUI) built with Swing, allowing users to send and receive messages in real-time.</p>

<h1>Project Details</h1>
Demo Video Link: <br>
Github Repository Link : https://github.com/JagtapNikhil/Chat_Application-.git
  
<h2>Features</h2>
1. &nbspReal-time Messaging: Users can send and receive messages instantly between the server and clients.</br>
2. &nbspGraphical User Interface (GUI): Built using Java Swing, the application provides an interactive chat window with message logs and user input &nbsp&nbsp&nbsp&nbsp&nbspfields.</br>
3. &nbspUser Profile Management: Users can view and update their account information through the GUI.</br>
4. &nbspCustomizable Themes: The application supports both light and dark themes, allowing users to toggle between them.</br>
5. &nbspFont Styles: Users can change the font style of the chat text to italic or bold.</br>
6. &nbspExit Confirmation: When the user chooses to exit, a confirmation dialog appears to ensure accidental closure is avoided.</br>
7. &nbspClear Text Field: Users can clear the text input field using the "Clear" button.</br>

<h2>How it Works</h2>
<p>This application establishes a TCP connection between the client and server using Java Sockets. The server listens for incoming connections, and once a client is connected, messages can be exchanged in real-time.</p>

1. The Server runs and listens for client connections on a specified port (1088).<br>
2. The Client connects to the server using the same port.<br>
3. Once the connection is established, both the server and client can send and receive messages.<br>
4. Messages sent by one client are displayed in the text area of both the server and client GUIs.<br>
5. The application continues running until the user exits, ensuring constant communication.<br>

<h2>Technologies Used</h2>
<p>1. Java Sockets: For handling client-server communication.<br>
2. Swing: For building the graphical user interface.<br>
3. Java I/O Streams: For reading and writing messages over the network.</p>

<h2>Project Structure</h2>
The project is composed of two main classes:<br>
1. Client2.java: Handles the client-side of the chat, including connecting to the server, sending and receiving messages, and updating the GUI.<br>
2. Server2.java: Manages the server-side, including accepting client connections, reading messages from clients, and broadcasting them to&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbspconnected clients.

<h1>Running the Project</h1>
<h2>Prerequisites</h2>
1. Java Development Kit (JDK) installed on your machine.<br>
2. Basic knowledge of Java, sockets, and Swing.<br>

<h2>Customization</h2>
1. Themes: Switch between light and dark modes from the Settings menu.<br>
2. Fonts: Change the font style to bold or italic from the Settings menu.<br>
3. Profile: Modify user details like full name and contact number from the Profile menu.<br>

<h2>Screenshots</h2>



