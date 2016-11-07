/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class Controller {
    // Create constants
    // Have access to the controller buttons

    private GUI gui;
    /// Have access to the map
    private Map map;
    // Have access to the coordinates of the player
    private int row;
    private int col;

    public Controller(GUI gui, Map map, int row, int col) {
        this.gui = gui;
        this.map = map;
        this.row = row;
        this.col = col;

        // Makes sure the GUI can talk to you!
        gui.setController(this);

        // Set the stating image
        Screen start = map.getScreen(row, col);
        gui.setImage(start.getImage());
    }

    public void goNorth() {
        // Get the screen we are on right now!
        Screen current = map.getScreen(row, col);
        // Ask if we can move north
        if (current.canGoNorth()) {
            // move up a row
            row--;

            // Get the new screen
            Screen newScreen = map.getScreen(row, col);
            // Set the image
            gui.setIconImage(newScreen.getImage());
        }
    }
}
