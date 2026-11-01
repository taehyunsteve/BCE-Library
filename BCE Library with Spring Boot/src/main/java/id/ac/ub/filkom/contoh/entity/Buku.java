package id.ac.ub.filkom.contoh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** «entity» Buku — tabel buku (skema 8a). */
@Entity
@Table(name = "buku")
public class Buku {

    @Id
    @Column(name = "id_buku", length = 10)
    private String idBuku;

    @Column(name = "judul", length = 200, nullable = false)
    private String judul;

    @Column(name = "stok")
    private int stok;

    protected Buku() { } // wajib untuk JPA

    public Buku(String idBuku, String judul, int stok) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.stok = stok;
    }

    /** +cekStok() : boolean — pesan [5]->[6] pada sequence diagram */
    public boolean cekStok() {
        return stok > 0;
    }

    /** +kurangiStok() : void — pesan [9]->[10] pada sequence diagram */
    public void kurangiStok() {
        if (stok <= 0) {
            throw new IllegalStateException("Stok sudah habis");
        }
        stok--;
    }

    public String getIdBuku() { return idBuku; }
    public String getJudul() { return judul; }
    public int getStok() { return stok; }
}
