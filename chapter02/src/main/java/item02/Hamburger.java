package item02;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Hamburger {

    //Required parameters
    private final Size size;

    private final Bread bread;

    private final Meat meat;

    //Optional parameters
    private final List<Additional> additional;

    public Hamburger(final Size size, final Bread bread, final Meat meat, final List<Additional> additional) {
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.additional = additional;
    }


    //To build the object in a correct state you need to provide those 3 required properties
    //A Hamburger cannot be built without knowing the size bread and the meat.
    public static Builder builder(final Size size, final Bread bread, final Meat meat) {
        return new Builder(size,bread,meat);
    }

    public static final class Builder {

        private Size size;
        private Bread bread;
        private Meat meat;
        private List<Additional> additional;

        private Builder(final Size size, final Bread bread, final Meat meat) {
            this.size = size;
            this.bread = bread;
            this.meat = meat;
        }

        public Builder size(final Size size) {
            this.size = size;
            return this;
        }

        public Builder bread(final Bread bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(final Meat meat) {
            this.meat = meat;
            return this;
        }

        public Builder addAdditional(final Additional newAdditional) {

            if(isNull(additional)){
                additional = new ArrayList<>();
            }

            additional.add(newAdditional);
            return this;
        }

        public Hamburger build() {
            final Hamburger hamburger = new Hamburger(size, bread, meat, additional);
            return hamburger;
        }
    }

    public Size getSize() {
        return size;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public List<Additional> getAdditional() {
        return additional;
    }
}
