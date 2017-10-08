package com.company;




    import java.util.HashMap;

    final public class Questions {
        private String questionnumber;

        private String question;
        private HashMap<String,Boolean> asnwers= new HashMap<>();

        public Questions(String questionnumber, String question){
            this.question=question;
            this.questionnumber=questionnumber;

        }


        public void addans(String one, boolean bool){
            asnwers.put(one,bool);
        }



        public void getans(){
            for (String s: asnwers.keySet()) {
                System.out.println(s);
            }
        }
        public String iscorrect(String answer) {

            String p = null;

            try {
                boolean x = asnwers.get(answer);
                if (x) {
                    p = "correct";
                } else
                    p = "wrong";

            } catch (NullPointerException r) {

            }
            return p;
        }

        public String getQuestionnumber() {
            return questionnumber;
        }

        public void setQuestionnumber(String questionnumber) {
            this.questionnumber = questionnumber;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

    }



