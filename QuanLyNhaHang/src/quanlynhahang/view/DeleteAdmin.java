/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhahang.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Anh Tiến ơi.Có Trộm!
 */
public class DeleteAdmin extends JPanel{
    private JLabel xoaadmin;
    public DeleteAdmin() {
        setBackground(new Color(250, 250, 250));
        setBounds(0, 180, 1220, 380);
        
//        Tittle
        JLabel title = new JLabel();
        title.setText("XÓA THÔNG TIN ADMIN");
        title.setBounds(450, 0, 420, 50);
        title.setFont(new Font("Serif", Font.PLAIN, 28));

//      Hàng tìm tài khoản
        JLabel lblTaikhoan = new JLabel();
        lblTaikhoan.setText("Tìm tài khoản :");
        lblTaikhoan.setBounds(330, 70, 150, 50);
        lblTaikhoan.setFont(new Font("Serif", Font.PLAIN, 24));
        JTextField txtTaikhoan = new JTextField();
        txtTaikhoan.setBounds(500, 70, 200, 40);
        JButton btnSearch = new JButton();
        btnSearch.setText("Tìm kiếm");
        btnSearch.setBounds(730, 70, 130, 40);
        btnSearch.setFont(new Font("Serif", Font.PLAIN, 24));
        
//      Hàng mật khẩu        
        JLabel lblMatkhaucu = new JLabel();
        lblMatkhaucu.setText("Mật khẩu :");
        lblMatkhaucu.setBounds(340, 130, 150, 50);
        lblMatkhaucu.setFont(new Font("Serif", Font.PLAIN, 24));
        JPasswordField txtMatkhaucu = new JPasswordField();
        txtMatkhaucu.setBounds(500, 130, 200, 40);
       
//      Button Reset        
        JButton btnReset = new JButton();
        btnReset.setText("Nhập lại");
        btnReset.setBounds(470,190, 120,50);
        btnReset.setFont(new Font("Serif", Font.PLAIN, 24));
       
//      Button Xóa  
        JButton btnDelete = new JButton();
        btnDelete.setText("Xóa");       
        btnDelete.setBounds(600,190, 120,50);    
        btnDelete.setFont(new Font("Serif", Font.PLAIN, 24));
//
        add(title);
        add(lblTaikhoan);
        add(txtTaikhoan);
        add(btnSearch);
        add(lblMatkhaucu);
        add(txtMatkhaucu);
        add(btnReset);
        add(btnDelete);
        setLayout(null);
    }

}
