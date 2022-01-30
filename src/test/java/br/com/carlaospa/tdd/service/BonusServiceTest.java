package br.com.carlaospa.tdd.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.carlaospa.tdd.modelo.Funcionario;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
       
       BonusService service = new BonusService();
       assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("25000"))));
    }

    @Test
    void bonusDeveriaSer10PorcentoDoSalario() {
       
       BonusService service = new BonusService();
       BigDecimal bonus = service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("2500")));
       Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
       
       BonusService service = new BonusService();
       BigDecimal bonus = service.calcularBonus(new Funcionario("João", LocalDate.now(), new BigDecimal("10000")));
       Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
    
}
