/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author robertodibiase
 */
public class Movie {

    private long id;
    private String title;
    private String language;
    private String overview;
    private Date releaseDate;
    private String posterImage;

    public Movie() {
    }

    public Movie(long id, String title, String language, String overview, Date releaseDate, String posterImage) {
        setId(id);
        setTitle(title);
        setLanguage(language);
        setOverview(overview);
        setReleaseDate(releaseDate);
        setPosterImage(posterImage);
    }

    public Movie(String title, String language, String overview, Date releaseDate, String posterImage) {
        setTitle(title);
        setLanguage(language);
        setOverview(overview);
        setReleaseDate(releaseDate);
        setPosterImage(posterImage);
    }

    @Override
    public String toString() {
        return title + " (" + language + ")\n";
    }

    //public String toString(boolean x) {
    // return "ID: " + id + " Title: " + title + " Release: "+ releaseDate;
    //}
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public final void setId(long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public final void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public final void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the overview
     */
    public String getOverview() {
        return overview;
    }

    /**
     * @param overview the overview to set
     */
    public final void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * @return the releaseDate
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public final void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the posterImage
     */
    public String getPosterImage() {
        return posterImage;
    }

    /**
     * @param posterImage the posterImage to set
     */
    public final void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }
}
