package com.acme.optident.resource;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Lob;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
public class SavedAppointmentResource {
    @NotNull
    @Lob
    @DateTimeFormat
    public Date fecha;

    @NotNull
    @Lob
    @DateTimeFormat
    public Time hora;

    @NotNull
    @Lob
    public String status;
}
