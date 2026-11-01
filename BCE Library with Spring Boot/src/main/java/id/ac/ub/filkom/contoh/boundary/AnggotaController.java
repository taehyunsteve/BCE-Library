package id.ac.ub.filkom.contoh.boundary;

import id.ac.ub.filkom.contoh.control.AnggotaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/** «boundary» AnggotaController: antarmuka web daftar anggota. */
@Controller
public class AnggotaController {

    private final AnggotaService anggotaService;

    public AnggotaController(AnggotaService anggotaService) {
        this.anggotaService = anggotaService;
    }

    @GetMapping("/anggota")
    public String lihatAnggota(Model model) {
        model.addAttribute("daftarAnggota", anggotaService.lihatSemuaAnggota());
        return "anggota";
    }
}
