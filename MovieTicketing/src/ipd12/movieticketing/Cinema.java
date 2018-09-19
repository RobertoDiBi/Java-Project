/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12.movieticketing;

/**
 *
 * @author robertodibiase
 */
public class Cinema {

    private long id;
    private String name;
    private String address;

    public Cinema(long id, String name, String address) {
        setId(id);
        setName(name);
        setAddress(address);
    }

    public Cinema() {
    }

    @Override
    public String toString() {
        return name + "\n" + address;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public final void setAddress(String address) {
        this.address = address;
    }

}
