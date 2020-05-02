package rojas.gabriel.projetoanimais.model;

import lombok.*;

/**
 @author Gabriel Rojas
 @since 01/05/2020
 @version Projeto 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Animals {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String specie;
    @Getter @Setter
    private String habitat;
    @Getter @Setter
    private String family;

}
