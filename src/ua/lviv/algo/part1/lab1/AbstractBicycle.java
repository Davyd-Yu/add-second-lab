package ua.lviv.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class AbstractBicycle {
    protected String brand;
    protected int maxSpeed;
    protected int currentSpeed;
    public abstract int getMaxDistance();

}
