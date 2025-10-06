package Modulo4;

import java.util.function.Consumer;

public class Persona implements Caminante {
    @Override
    public void caminar() {
        System.out.println("Un pie y despues otro, a base de comer");
    }

    public void executa(Consumer<Caminante> c) {
        c.accept(Persona.this);
        c.andThen(caminante -> caminante.caminar()).accept(this);
    }
}
