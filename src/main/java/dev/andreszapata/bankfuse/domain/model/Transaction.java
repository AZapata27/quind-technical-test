package dev.andreszapata.bankfuse.domain.model;

import dev.andreszapata.bankfuse.domain.enums.TipoTransaction;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private Long idTransaccion;
    private Long idClient;
    private Long idProduct;
    private TipoTransaction tipoTransaction;
    private LocalDateTime fechaTransaccion;
    private Double monto;

}
