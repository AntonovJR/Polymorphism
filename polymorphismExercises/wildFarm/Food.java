package polymorphismExercises.wildFarm;

public abstract class Food {
    private Integer quantity;


    public Integer getQuantity() {
        return this.quantity;
    }

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }
}
