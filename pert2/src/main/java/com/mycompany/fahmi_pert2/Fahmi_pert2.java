/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fahmi_pert2;

/**
 *
 * @author USER
 */
public class Fahmi_pert2 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi Goreng");
        
        Admin admin = new Admin();
        admin.manageUser();
        admin.logout();
    }
}
