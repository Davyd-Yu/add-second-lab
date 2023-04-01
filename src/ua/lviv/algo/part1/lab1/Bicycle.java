package ua.lviv.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString (callSuper = true)

public class Bicycle extends AbstractBicycle{

    public Bicycle(String brand, String type, int maxSpeed, int currentSpeed) {
        super(brand, maxSpeed, currentSpeed);
        this.type = type;
    }
    private String type;

    public void accelerate(int speed) {
        if ((currentSpeed + speed) > maxSpeed) {
            currentSpeed = maxSpeed;
        } else {
            currentSpeed += speed;
        }
    }

    public void slowDown(double speed){
        if((currentSpeed - speed) < 0){
            currentSpeed = 0;
        } else {
            currentSpeed -= speed;
        }
    }
    public void brake() {
        currentSpeed = 0;
    }

    @Override
    public int getMaxDistance(){
        return Integer.MAX_VALUE;
    }

    private static Bicycle defaultBicycle = new Bicycle();

    public static Bicycle getInstance() {
        return defaultBicycle;
    }

}
