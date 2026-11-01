package id.ac.ub.filkom.contoh.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/** Akses tabel buku (implementasi otomatis Spring Data JPA). */
public interface BukuRepository extends JpaRepository<Buku, String> {
    List<Buku> findByJudulContainingIgnoreCase(String kata);
}
