/**
 * @autor Patrick Astner
 * @version 7. Oktober 2018
 */





        public class Stadt{

            private String name;
            Flughafen[] flughaefen = new Flughafen[6];;

            public Stadt(String name) {

                this.name = name;
                System.out.println(toString() + " angelegt.");
            }

            /**
              * @return returns name of "Stadt"
             */
            public String getName() {
                return name;
            }

            public String toString(){
                return("Stadt "+name);
            }

            public int getAnzahlFlughaefen(){
                return flughaefen.length; }


        }
