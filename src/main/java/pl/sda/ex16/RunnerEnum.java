package pl.sda.ex16;

public enum RunnerEnum {
    BEGINNER(360, 600),
    INTERMEDIATE(300, 359),
    ADVANCED(0,259);

    private int minimumTime;
    private int maximumTime;

    RunnerEnum(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    public static RunnerEnum getFitnessLevel(int timeInMinutes) {
        if (BEGINNER.getMinimumTime() <= timeInMinutes && timeInMinutes < BEGINNER.getMaximumTime()) {
            return BEGINNER;
        }
        for (RunnerEnum level : RunnerEnum.values()) {
            if (BEGINNER.getMinimumTime() <= timeInMinutes && timeInMinutes <= level.getMaximumTime()) {
                return level;
            }
        }
        return null;
    }
}
