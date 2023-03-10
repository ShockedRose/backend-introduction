package com.pichincha.bookin.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillboardEntity {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "STATUS")
    @NotNull(message = "El status de la cartelera no puede ser nulo")
    Boolean status;
    @Column(name = "DATE")
    @NotNull(message = "El fecha de la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime date;
    @Column(name = "END_TIME")
    @NotNull(message = "El fecha de finalizacion en la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    LocalDateTime endTime;
    @Column(name = "START_TIME")
    @NotNull(message = "El fecha de inicio en la cartelera no puede ser nulo")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    LocalDateTime starTime;
}