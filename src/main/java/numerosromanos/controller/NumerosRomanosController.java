package numerosromanos.controller;


import numerosromanos.service.NumerosRomanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {

    @Autowired
    NumerosRomanosService numerosRomanosService;

    @GetMapping("/converter/{numero}")
    public ResponseEntity<?> converterIntParaRomanos(@PathVariable int numero) {
        String romano = numerosRomanosService.RomanNumerals(numero);
        return ResponseEntity.ok(romano);
    }
}
