package practice_06_01_2021;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * - create a class called ScrumTeam
 *
 *                Attributes:
 *                             PO, BA, SM,
 *                             ArrayList<Tester> testersList = new ArrayList<>(),
 *                             ArrayList<Developer> devopsList = new ArrayList<>(),
 *                             hasSprint, hasMeeting
 *
 *                 Constructor:
 *                       sets the names of: PO, BA, SM
 *
 *                 Actions:
 *
 *                    addTester(Tester tester): adds the given tester to the testers arraylist
 *
 *                    addTesters(Tester[] testers): adds the given testers to the testers arraylist
 *
 *                    addDeveloper(Developer developer): adds the given developer to the developers arraylist
 *
 *                    addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
 *
 *                    removeTester(long employeeID): removes the given tester from the testers arraylist
 *
 *                    removeDeveloper(long employeeID): removes the developer from the developers arraylist
 *
 *                    toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
public class ScrumTeam {

    String productOwner;
    String ScrumMaster;
    String businessAnalyst;

    ArrayList<Tester> allTesters = new ArrayList<>();
    ArrayList<Developer> allDeveloper = new ArrayList<>();

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.ScrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
    }

    public void addTester(Tester tester) {
        this.allTesters.add(tester);

    }

    public void addTester(Tester ... testers) {
        this.allTesters.addAll(Arrays.asList(testers));
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Ahmad", "Nasim", "Erfan Khan");
        System.out.println(scrumTeam.allTesters);
        Tester tester1 = new Tester("Ahmad", 10, "SDET", 100000);
        scrumTeam.addTester(tester1);



    }




















}
