    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package AplikasiPenjualan;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
    import java.awt.HeadlessException;  

    /**
     *
     * @author X13 Yoga
     */
    public class ConnectionDb {
        // Menggunakan UPPER_SNAKE_CASE untuk konstanta sesuai konvensi Java dan mengatasi peringatan.
        private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //
        private static final String URL = "jdbc:mysql://localhost:3306/penjualan"; //
        private static final String USER = "root"; //
        private static final String PASS = ""; //

        public static Connection getConnection() {
            Connection conn = null; // Deklarasikan koneksi secara lokal di dalam metode.
            try {
                // Memuat driver JDBC
                Class.forName(JDBC_DRIVER); //
                System.out.println("Driver JDBC berhasil dimuat!");

                // Mendapatkan koneksi
                conn = DriverManager.getConnection(URL, USER, PASS); //
                // Hapus JOptionPane.showMessageDialog untuk pesan sukses di sini.
                // System.out.println("Koneksi ke database berhasil!"); // Opsional: tampilkan di konsol untuk debugging

            } catch (ClassNotFoundException cnf) { //
                String message = "Driver JDBC tidak ditemukan!\nError: " + cnf.getMessage();
                JOptionPane.showMessageDialog(null, message, "Kesalahan Koneksi", JOptionPane.ERROR_MESSAGE);
                System.err.println(message);
                conn = null; // Pastikan koneksi null jika ada kesalahan
            } catch (SQLException e) { //
                String message = "Koneksi database gagal!\nError: " + e.getMessage();
                JOptionPane.showMessageDialog(null, message, "Kesalahan Koneksi", JOptionPane.ERROR_MESSAGE);
                System.err.println(message);
                conn = null; // Pastikan koneksi null jika ada kesalahan
            } catch (HeadlessException e) { //
                // Tangani HeadlessException jika aplikasi berjalan di lingkungan tanpa GUI (jarang untuk aplikasi desktop)
                String message = "Terjadi kesalahan pada lingkungan grafis (HeadlessException).\nError: " + e.getMessage();
                System.err.println(message);
                conn = null; // Pastikan koneksi null jika ada kesalahan
            }
            return conn; // Kembalikan objek koneksi
        }
    }
