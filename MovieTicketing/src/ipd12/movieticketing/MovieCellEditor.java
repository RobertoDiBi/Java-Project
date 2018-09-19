/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Brandon
 */
public class MovieCellEditor extends AbstractCellEditor implements TableCellEditor {

    MovieCellComponent movieComp;

    public MovieCellEditor() {
        movieComp = new MovieCellComponent();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        MovieWithPic movie = (MovieWithPic) value;
        movieComp.updateData(movie, isSelected, table);
        return movieComp;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
