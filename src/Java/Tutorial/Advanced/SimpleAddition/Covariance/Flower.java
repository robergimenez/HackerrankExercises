package Java.Tutorial.Advanced.SimpleAddition.Covariance;

/**
 * Created by rgimenez on 04/02/2017.
 */
public class Flower {
    public String whatsYourName(){
        return "I have my name and types";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Lotus extends Flower{
    @Override
    public String whatsYourName(){
        return "Lotus";
    }
}

class State{
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends State{
    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}
class Karnataka extends State{
    @Override
    public Lotus yourNationalFlower(){
        return new Lotus();
    }
}

class AndhraPradesh extends State{
    @Override
    public Lily yourNationalFlower(){
        return new Lily();
    }
}