import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParkingApp extends JFrame {
    private ParkingSystem parkingSystem;

    public ParkingApp() {
        parkingSystem = new ParkingSystem(10, 0.5); // 10 spots, $0.5/min rate

        setTitle("Parking System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Parking System");
        title.setBounds(150, 10, 200, 30);
        add(title);

        JButton entryButton = new JButton("Vehicle Entry");
        entryButton.setBounds(50, 80, 120, 30);
        add(entryButton);

        JButton exitButton = new JButton("Vehicle Exit");
        exitButton.setBounds(200, 80, 120, 30);
        add(exitButton);

        JButton listButton = new JButton("Vehicle List");
        listButton.setBounds(125, 140, 120, 30);
        add(listButton);

        // Araç Girişi
        entryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String licensePlate = JOptionPane.showInputDialog("Enter License Plate:");
                Vehicle vehicle = new Vehicle(licensePlate);
                ParkingSpot spot = parkingSystem.assignSpot(vehicle);
                if (spot != null) {
                    JOptionPane.showMessageDialog(null, "Vehicle assigned to Spot " + spot.getSpotId());
                } else {
                    JOptionPane.showMessageDialog(null, "No available spots!");
                }
            }
        });

        // Araç Çıkışı 
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String spotIdInput = JOptionPane.showInputDialog("Enter Spot ID:");
                try {
                    int spotId = Integer.parseInt(spotIdInput);
                    ParkingSpot spot = parkingSystem.getSpotById(spotId);

                    if (spot != null && spot.isOccupied()) {
                        Vehicle vehicle = spot.getVehicle();
                        double cost = parkingSystem.calculateCost(vehicle);
                        parkingSystem.freeSpot(spotId);
                        JOptionPane.showMessageDialog(null, "Total cost: $" + cost);
                    } else {
                        JOptionPane.showMessageDialog(null, "Spot is empty or does not exist!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Spot ID!");
                }
            }
        });

        // Araç Listesi
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showVehicleList();
            }
        });
    }

    private void showVehicleList() {
        String[] columnNames = {"Spot ID", "License Plate", "Entry Time"};
        Object[][] data = parkingSystem.getOccupiedSpotsData();

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        JFrame frame = new JFrame("Vehicle List");
        frame.setSize(400, 300);
        frame.add(scrollPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ParkingApp().setVisible(true);
    }
}
