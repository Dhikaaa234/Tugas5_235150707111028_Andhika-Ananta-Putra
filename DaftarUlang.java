import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarUlang extends JFrame {
    private JTextField txtNama, txtTanggalLahir, txtNoPendaftaran, txtNoTelp, txtLinkBerkas, txtAlamat, txtEmail;
    private JButton btnSubmit;
    
    public DaftarUlang() {
        setTitle("Form Daftar Ulang");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(8, 2));
        
        add(new JLabel("Nama:"));
        txtNama = new JTextField();
        add(txtNama);
        
        add(new JLabel("Tanggal Lahir:"));
        txtTanggalLahir = new JTextField();
        add(txtTanggalLahir);
        
        add(new JLabel("No Pendaftaran:"));
        txtNoPendaftaran = new JTextField();
        add(txtNoPendaftaran);
        
        add(new JLabel("No Telp:"));
        txtNoTelp = new JTextField();
        add(txtNoTelp);
        
        add(new JLabel("Link Berkas (drive):"));
        txtLinkBerkas = new JTextField();
        add(txtLinkBerkas);
        
        add(new JLabel("Alamat:"));
        txtAlamat = new JTextField();
        add(txtAlamat);
        
        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);
        
        btnSubmit = new JButton("Submit");
        add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNama.getText().isEmpty() || txtTanggalLahir.getText().isEmpty() || txtNoPendaftaran.getText().isEmpty() || 
                    txtNoTelp.getText().isEmpty() || txtLinkBerkas.getText().isEmpty() || txtAlamat.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        new TampilkanData(txtNama.getText(), txtTanggalLahir.getText(), txtNoPendaftaran.getText(), txtNoTelp.getText(), 
                                          txtLinkBerkas.getText(), txtAlamat.getText(), txtEmail.getText());
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DaftarUlang().setVisible(true);
            }
        });
    }
}

class TampilkanData extends JFrame {
    public TampilkanData(String nama, String tanggalLahir, String noPendaftaran, String noTelp, String linkBerkas, String alamat, String email) {
        setTitle("Data Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(7, 2));
        
        add(new JLabel("Nama:"));
        add(new JLabel(nama));
        
        add(new JLabel("Tanggal Lahir:"));
        add(new JLabel(tanggalLahir));
        
        add(new JLabel("No Pendaftaran:"));
        add(new JLabel(noPendaftaran));
        
        add(new JLabel("No Telp:"));
        add(new JLabel(noTelp));
        
        add(new JLabel("Link Berkas (drive):"));
        add(new JLabel(linkBerkas));
        
        add(new JLabel("Alamat:"));
        add(new JLabel(alamat));
        
        add(new JLabel("Email:"));
        add(new JLabel(email));
        
        setVisible(true);
    }
}
