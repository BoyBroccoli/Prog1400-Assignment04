import javax.swing.*;

public class Panel extends JPanel {

    // Arrays for textFieldBoxes
    String[] animals = {"Penguin", "Sea Lion", "Walrus"};
    String[] genders = {"Male", "Female"};
    String[] dentalHealth = {"good", "average", "poor"};


    // Buttons
    JButton addEntryButton = new JButton("Add Entry");
    JButton addGpsButton = new JButton("Add GPS");
    JButton viewReportsButton = new JButton("View Reports");
    JButton showNewEntriesButton = new JButton("Show New Entries");
    JButton showGpsLogsButton = new JButton("Show GPS Logs");
    JButton backButton = new JButton("Back");


    // Labels
    JLabel animalObservedLabel = new JLabel("Animal Observed:");
    JLabel animalLabel = new JLabel("Animal");
    JLabel genderLabel = new JLabel("Gender");
    JLabel weightLabel = new JLabel("Weight in Kg");
    JLabel bloodPressureLabel = new JLabel("Blood Pressure");
    JLabel gpsCoordinatesLabel = new JLabel("GPS Coordinates: (-)##.####### (-)(##or###).#######");
    JLabel dentalHealthLabel = new JLabel("Dental Health");


    // Text fields and Boxes
    JComboBox<String> animalField = new JComboBox<String>(animals); // drop down box
    JComboBox<String> genderField = new JComboBox<String>(genders); // drop down box
    JComboBox<String> dentalHealthField = new JComboBox<>(dentalHealth); // drop down box
    JTextField weightField = new JTextField();
    JTextField bloodPressureField = new JTextField();
    JTextField coordinatesField = new JTextField();
    JTextArea coordinateList = new JTextArea();

    public Panel(){

        // define layout



    }

}
