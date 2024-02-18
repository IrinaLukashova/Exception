public class Human {
    String lastName;
    String name;
    String patronymic;
    String birthDay;
    String gender;

    public Human(String lastName, String name, String patronymic, String birthDay, String  gender) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s>",lastName, name, patronymic, birthDay, gender);
    }
}
