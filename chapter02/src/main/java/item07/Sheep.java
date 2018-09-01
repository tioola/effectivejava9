package item07;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class Sheep {

    private static final Integer DNA_FACTOR_SHEEP=1000;

    private String name;

    private Double weight;

    private String dna;

    private Sheep sheep;

    private Sheep(final String name, final Double weight) {
        this.name = name;
        this.weight = weight;
        dna = StringUtils.EMPTY;
        //For new sheeps a new dna is generated.
        for(int i = 0; i< Sheep.DNA_FACTOR_SHEEP; i++){
            dna += RandomStringUtils.random(i);
        }

        System.out.println("created");
    }

    //Accidentally keeping the reference from the other sheep
    private Sheep(final Sheep toBeCloned){
        sheep = toBeCloned;
        name = sheep.getName();
        weight = sheep.getWeight();
        dna = new String(sheep.dna);//This is done in porpouse we will have a different instance of the same string...

    }

    public static Sheep getOriginal(final String name, final Double weight){
        return new Sheep(name, weight);
    }

    public static Sheep getClone(final Sheep sheep){
        return new Sheep(sheep);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(final Double weight) {
        this.weight = weight;
    }


}
