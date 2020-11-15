package one;



    class Student extends Person {
        private String school;
        public Student(String name,int age,String school){
            super(name ,age);
            this.setSchool(school);
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }
        public String getinfo(){
            return super.getinfo()
                    +";学校"+this.getSchool();
        }
    }

