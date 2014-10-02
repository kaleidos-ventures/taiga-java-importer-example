package demo;

import net.kaleidos.domain.Project;
import net.kaleidos.taiga.TaigaClient;

public class Application {

    public static void main(String[] args) {
        TaigaClient taigaClient = new TaigaClient("http://localhost:8000");
        taigaClient.authenticate("user1", "123123");

        Project project = new Project()
            .setName("Test project")
            .setDescription("My super awesome project");

        project = taigaClient.createProject(project);

        System.out.println(project);

        taigaClient.deleteProject(project);
    }
}