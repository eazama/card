/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.card;

/**
 *
 * @author Eric
 */
public interface Flippable {
    
    boolean FACEUP;
    default public void flip(){
        FACEUP = !FACEUP;
    }
    
}
