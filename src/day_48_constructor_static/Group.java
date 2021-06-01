package day_48_constructor_static;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

public class Group {


    private String groupName;
    private List<String> namesOfMembers = new ArrayList<>();

    public void addMember(String newMember) {
        namesOfMembers.add(newMember);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", namesOfMembers=" + namesOfMembers +
                '}';
    }

    public Group() {

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<String> getNamesOfMembers() {
        return namesOfMembers;
    }

    public void setNamesOfMembers(List<String> namesOfMembers) {
        this.namesOfMembers = namesOfMembers;
    }



}
