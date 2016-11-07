/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class RunGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get interface pop up
        // Create the interface
        GUI gui = new GUI();
        // Show the interface
        gui.setVisible(true);

        // Create the map to be used
        Map map = new Map("zelda/tiles.txt");

        // Create the game controller
        Controller c = new Controller(gui, map, 7, 8);
    }
}
