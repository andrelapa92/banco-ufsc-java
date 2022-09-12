/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fullstack.ufsc;

import java.util.Comparator;

/**
 *
 * @author Andre
 */
public class ComparadorSaldoDec implements Comparator<Conta> {
    
    @Override
    public int compare(Conta c1, Conta c2) {
        if (c1.getSaldo() < c2.getSaldo()) {
            return 1;
        } else if (c1.getSaldo() > c2.getSaldo()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
