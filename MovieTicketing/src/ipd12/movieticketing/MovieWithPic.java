/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 1796174
 */
public class MovieWithPic {

    private long id;
    private String title;
    private String language;
    private String overview;
    private Date releaseDate;
    private ImageIcon posterImage;

    public MovieWithPic(Movie movie) throws MalformedURLException, IOException {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.language = movie.getLanguage();
        this.overview = movie.getOverview();
        URL url = new URL(movie.getPosterImage());
        Image img = ImageIO.read(url);
        Image resImg = img.getScaledInstance(200, 289, Image.SCALE_DEFAULT);
        this.posterImage = new ImageIcon(resImg);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getOverview() {
        return overview;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public ImageIcon getPosterImage() {
        return posterImage;
    }
}
