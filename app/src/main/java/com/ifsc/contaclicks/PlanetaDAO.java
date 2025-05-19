package com.ifsc.contaclicks;

import java.util.ArrayList;

public class PlanetaDAO {


    ArrayList<Planeta> planetas;

    public PlanetaDAO() {
        this.planetas= new ArrayList<>();
        String[] nomes = new String[] {"Mercurio","Venus","Terra","Marte","Jupter","Saturno","Urano","Netuno"};
        Integer[] imagens = new Integer[]{R.drawable.mercury,R.drawable.venus,R.drawable.earth,R.drawable.mars
                ,R.drawable.jupter,R.drawable.neptune,R.drawable.saturn,R.drawable.uranus};
        for (int i = 0;i< nomes.length;i++){
            planetas.add(new Planeta(nomes[i],imagens[i]));

        }
    }

    public ArrayList<Planeta> getPlanetas(){
        return this.planetas;
    }
}
