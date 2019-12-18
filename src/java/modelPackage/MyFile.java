/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelPackage;
//model gia ton pinaka myfiles

import java.sql.Blob;


/**
 *
 * @author antonis
 */
public class MyFile {
    
    private int id;
    private String filename;
    private byte[] thefile;
    private Blob thefileasablop;

    public int getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public byte[] getThefile() {
        return thefile;
    }

    public Blob getThefileasablop() {
        return thefileasablop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setThefile(byte[] thefile) {
        this.thefile = thefile;
    }

    public void setThefileasablop(Blob thefileasablop) {
        this.thefileasablop = thefileasablop;
    }

    public MyFile() {
        
    }

    public MyFile(int id, String filename) {
        this.id = id;
        this.filename = filename;
        
    }
    
    
    
    
    
    
}
