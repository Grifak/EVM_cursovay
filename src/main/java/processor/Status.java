package processor;

import java.util.Arrays;

public enum Status {
    START("START"),
    WORK_WITH_MEMORY_1("WORK_WITH_MEMORY_1"),
    WORK_WITH_MEMORY_2("WORK_WITH_MEMORY_2"),
    WORK_WITH_MEMORY_3("WORK_WITH_MEMORY_3"),
    WORK_WITH_MEMORY_4("WORK_WITH_MEMORY_4"),
    WAIT("WAIT"),
    FINISHED("FINISHED");

    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Status fromString(String value){
        return Arrays.stream(Status.values())
                .filter(s->s.title.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(()-> new RuntimeException(String.format("Status %s not found", value)));
    }
}
