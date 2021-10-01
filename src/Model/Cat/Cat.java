package Model.Cat;

public class Cat {
    private String name;
    private String breed;
    private int lives;
    private int age;
    private int totalScratch;
    private String color;
    private boolean isFriendly;

    public Cat(String name, String breed, int lives, int age, int totalScratch, String color, boolean isFriendly) {
        this.name = name;
        this.breed = breed;
        this.lives = lives;
        this.age = age;
        this.totalScratch = totalScratch;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getLives() {
        return lives;
    }

    public int getAge() {
        return age;
    }

    public int getTotalScratch() {
        return totalScratch;
    }

    public String getColor() {
        return color;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTotalScratch(int totalScratch) {
        this.totalScratch = totalScratch;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override public String toString()
    {
        return "Cat{" + "name='" + name + '\'' + ", breed='" + breed + '\''
            + ", lives=" + lives + ", age=" + age + ", totalScratch="
            + totalScratch + ", color='" + color + '\'' + ", isFriendly="
            + isFriendly + '}';
    }
}
