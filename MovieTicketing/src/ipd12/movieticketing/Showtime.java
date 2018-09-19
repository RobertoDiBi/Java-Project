/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.sql.Date;

/**
 *
 * @author robertodibiase
 */
public class Showtime {
    private long id;
    private long cinemaId;
    private long movieId;
    private Date date;
    private String time;
    private long maxCapacity;

    public Showtime() {
    }

    public Showtime(long id, long cinemaId, long movieId, Date date, String time, long maxCapacity) {
        setId(id);
        setCinemaId(cinemaId);
        setMovieId(movieId);
        setDate(date);
        setTime(time);
        setMaxCapacity(maxCapacity);
    }
    
    public Showtime(long cinemaId, long movieId, Date date, String time, long maxCapacity) {
        
        setCinemaId(cinemaId);
        setMovieId(movieId);
        setDate(date);
        setTime(time);
        setMaxCapacity(maxCapacity);
    }
    
    @Override
    public String toString(){
        return "ID:"+id+" Cinema Id: " + cinemaId + " Movie Id: " + movieId + " Date: " +date +" Time: " +time + " Capacity: " + maxCapacity;
    }

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
     * @return the cinemaId
     */
    public long getCinemaId() {
        return cinemaId;
    }

    /**
     * @param cinemaId the cinemaId to set
     */
    public final void setCinemaId(long cinemaId) {
        this.cinemaId = cinemaId;
    }

    /**
     * @return the movieId
     */
    public long getMovieId() {
        return movieId;
    }

    /**
     * @param movieId the movieId to set
     */
    public final void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public final void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public final void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the maxCapacity
     */
    public long getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public final void setMaxCapacity(long maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    
    
}
