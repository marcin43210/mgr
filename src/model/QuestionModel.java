/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pan
 */
public class QuestionModel {
    
    private long id;
    private long categoryId;
    private String content;
    private String odp1;
    private String odp2;

    public String getOdp1() {
        return odp1;
    }

    public void setOdp1(String odp1) {
        this.odp1 = odp1;
    }

    public String getOdp2() {
        return odp2;
    }

    public void setOdp2(String odp2) {
        this.odp2 = odp2;
    }

    public String getOdp3() {
        return odp3;
    }

    public void setOdp3(String odp3) {
        this.odp3 = odp3;
    }

    public String getOdp4() {
        return odp4;
    }

    public void setOdp4(String odp4) {
        this.odp4 = odp4;
    }
    private String odp3;
    private String odp4;
    
    public QuestionModel()
    {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
