public class Main {

    public static void main(String[] args) {

    String digi = "digi 2021 diji java 2022 ";

    String [] digi2 = digi.split(" ");
        System.out.println("yexanak 1");

        System.out.println(digi2[0] + " " + digi2[4]+ " "+digi2[3]);

        System.out.println("yexanak 2");
        
        Model model = new Model();
        model.setName(digi2[0]);
        model.setYear(Integer.parseInt(digi2[4]));
        model.setSurname(digi2[3]);

        System.out.println(model.getName() + " " + model.getYear() + " " + model.getSurname());

    }
}
