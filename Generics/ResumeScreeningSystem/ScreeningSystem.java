package ResumeScreeningSystem;

import java.util.List;

public class ScreeningSystem {

    public <T extends JobRole> void screenResume(Resume<T> resume) {
        String RESET = "\u001b[0m";
        String RED = "\u001b[31m";
        String GREEN = "\u001b[32m";
        String BLUE = "\u001b[34m";
        String YELLOW = "\u001b[33m";

        System.out.printf(BLUE + "\nScreening %s for %s role...\n" + RESET, resume.getCandidateName(), resume.getTargetRole().getJobRole());

        List<String> required = resume.getTargetRole().getRequiredSkills();
        List<String> candidate = resume.getCandidateSkills();

        long matchCount = required.stream()
                .filter(req -> candidate.stream().anyMatch(can -> can.equalsIgnoreCase(req)))
                .count();
        double matchPercentage = (double) matchCount / required.size() * 100;

        System.out.printf(YELLOW + "Skill Match: %.2f%% (%d out of %d skills)\n" + RESET, matchPercentage, matchCount, required.size());
        if (matchPercentage >= 75) {
            System.out.println(GREEN + "Result: PASSED. Recommended for interview." + RESET);
        } else {
            System.out.println(RED + "Result: FAILED. Does not meet minimum skill requirements." + RESET);
        }
    }

    public void screenBatch(List<Resume<? extends JobRole>> resumes) {
        System.out.println("\u001b[36m" + "\n---------- Starting Batch Screening Process ----------" + "\u001b[0m");
        for (Resume<? extends JobRole> resume : resumes) {
            screenResume(resume);
        }
        System.out.println("""
                \u001b[36m
                ---------- Batch Screening Complete ----------
                \u001b[0m""");
    }
}