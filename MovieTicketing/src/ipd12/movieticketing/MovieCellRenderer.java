/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Brandon
 */
public class MovieCellRenderer implements TableCellRenderer {

    MovieCellComponent movieComponent;

    public MovieCellRenderer() {
        movieComponent = new MovieCellComponent();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        MovieWithPic movie = (MovieWithPic) value;

        movieComponent.updateData(movie, isSelected, table);
        return movieComponent;
    }
}
