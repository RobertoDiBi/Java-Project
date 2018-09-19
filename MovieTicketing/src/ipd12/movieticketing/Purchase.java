/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author robertodibiase
 */
public class Purchase {
    private long id;
    private long userId;
    private long showtimeId;
    private Date purchaseDate;
    private long numberOfTickets;
    private BigDecimal totalPrice;

    public Purchase(long id, long userId, long showtimeId, Date purchaseDate, long numberOfTickets, BigDecimal totalPrice) {
        setId(id);
        setUserId(userId);
        setShowtimeId(showtimeId);
        setPurchaseDate(purchaseDate);
        setNumberOfTickets(numberOfTickets);
        setTotalPrice(totalPrice);
    }
    
     public Purchase(long userId, long showtimeId, Date purchaseDate, long numberOfTickets, BigDecimal totalPrice) {
        setUserId(userId);
        setShowtimeId(showtimeId);
        setPurchaseDate(purchaseDate);
        setNumberOfTickets(numberOfTickets);
        setTotalPrice(totalPrice);
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
     * @return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public final void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return the showtimeId
     */
    public long getShowtimeId() {
        return showtimeId;
    }

    /**
     * @param showtimeId the showtimeId to set
     */
    public final void setShowtimeId(long showtimeId) {
        this.showtimeId = showtimeId;
    }

    /**
     * @return the purchaseDate
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public final void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return the numberOfTickets
     */
    public long getNumberOfTickets() {
        return numberOfTickets;
    }

    /**
     * @param numberOfTickets the numberOfTickets to set
     */
    public final void setNumberOfTickets(long numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    /**
     * @return the totalPrice
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public final void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    
}
