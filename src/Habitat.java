public class Habitat {
        private String habName;
        private String temputure;
        private String description;
        private String flora;
        private String fauna;

        public Habitat(String habName, String temputure, String description, String fauna, String flora){
            this.habName = habName;
            this.temputure = temputure;
            this.description = description;
            this.flora = flora;
            this.fauna = fauna;
        }
        public String getHabName() {
                return habName;
        }
        public String getTemputure(){
                return temputure;
        }
        public String getDescription(){
                return description;
        }
        public String getFlora(){
                return flora;
        }
        public String getFauna(){
                return fauna;
        }

        public String printInformation(){
                System.out.println("The habitats name is " + habName);
}