package List.BasicsOperations;

public class Tasks {

    // attributes

    private String description;

    public Tasks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + description + '\'' +
                '}';
    }
}
