package demergingQueue;

public class Employee {
        private String name;
        private String gender;
        private String birthDay;

        public Employee() {
        }

        public Employee(String name, String gender, String birthDay) {
            this.name = name;
            this.gender = gender;
            this.birthDay = birthDay;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    '}';
        }
    }
