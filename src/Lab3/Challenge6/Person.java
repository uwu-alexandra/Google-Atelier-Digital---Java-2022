package Lab3.Challenge6;

public class Person {

    private final String name; //mandatory
    private String job;
    private String univeristy;
    private boolean drivingLicense;
    private boolean isMarried;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniveristy() {
        return univeristy;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
        this.job = builder.job;
        this.univeristy = builder.univeristy;
    }

    public static class Builder {

        private String name; //mandatory
        private String job;
        private String univeristy;
        private boolean drivingLicense;
        private boolean isMarried;

        public Builder(String newName) {
            this.name = newName;
        }

        public Builder job(String newJob) {
            this.job = newJob;
            return this;
        }

        public Builder university(String newUniveristy) {
            this.univeristy = newUniveristy;
            return this;
        }

        public Builder drivingLicense(boolean newDrivingLicense) {
            this.drivingLicense = newDrivingLicense;
            return this;
        }

        public Builder isMarried(boolean newIsMarried) {
            this.isMarried = newIsMarried;
            return this;
        }

        public Person build() {
            return new Person((this));
        }
    }

}
