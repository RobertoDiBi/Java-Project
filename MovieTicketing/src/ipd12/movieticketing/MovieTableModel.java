/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Brandon
 */
public class MovieTableModel extends AbstractTableModel {

    ArrayList<MovieWithPic> movies;

    public MovieTableModel(ArrayList<MovieWithPic> movies) {
        this.movies = movies;
    }

    public Class getColumnClass(int columnIndex) {
        return MovieWithPic.class;
    }

    public int getColumnCount() {
        return 1;
    }

    public String getColumnName(int columnIndex) {
        return "Movies";
    }

    public int getRowCount() {
        return (movies == null) ? 0 : movies.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return (movies == null) ? null : movies.get(rowIndex);
    }

    public boolean isCellEditable(int columnIndex, int rowIndex) {
        return true;
    }
}
