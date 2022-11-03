import com.bootcamp.domain.Bootcamp;
import com.bootcamp.domain.Course;
import com.bootcamp.domain.Dev;
import com.bootcamp.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Introductory Java Course for Beginners");
        course1.setDescription("Java programming course for beginners.");
        course1.setHoursSchedule(12);

        Course course2 = new Course();
        course2.setTitle("React Native with Hooks and Context API");
        course2.setDescription("Build a User Registration Application (CRUD) and learn to use Context API with useReducer!");
        course2.setHoursSchedule(11);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Knowing the Domain of a OOP Application");
        mentorship.setDescription("With our development environment properly ready, let's reflect on our application domain");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp FullStack Java Developer");
        bootcamp.setDescription("Learn concepts java and react in this fullstack bootcamp");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devDuvaldo = new Dev();
        devDuvaldo.setName("Duvaldo");
        devDuvaldo.registerBootcamp(bootcamp);
        System.out.println("Registered content to: " + devDuvaldo.getRegisteredContent());
        devDuvaldo.toProgress();
        devDuvaldo.toProgress();
        System.out.println("Registered content to: " + devDuvaldo.getRegisteredContent());
        System.out.println("Content completed by: " + devDuvaldo.getCompletedContent());
        System.out.println("XP: " + devDuvaldo.calculateTotalXP());

        System.out.println("-------");

        Dev devCassio = new Dev();
        devCassio.setName("Cássio");
        devCassio.registerBootcamp(bootcamp);
        System.out.printf("Registered content to: " + devCassio.getRegisteredContent());
        devCassio.toProgress();
        devCassio.toProgress();
        devCassio.toProgress();
        System.out.printf("Registered content to: " + devCassio.getRegisteredContent());
        System.out.println("Content completed by: " + devCassio.getCompletedContent());
        System.out.println("XP: " + devCassio.calculateTotalXP());
    }
}