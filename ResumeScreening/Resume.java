import java.util.List;

public class Resume<T extends JobRole> {
    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public void displayRole() {
        System.out.println("Processing resume for: " + role.getTitle());
    }

    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening: " + role.getTitle());
        }
    }
}