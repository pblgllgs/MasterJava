package ValorReferencia;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona {

    private String nombre;

    public void cambiaNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

}
