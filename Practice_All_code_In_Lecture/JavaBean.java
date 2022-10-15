package Practice_All_code_In_Lecture;

public class JavaBean {
        // we create private integer
        private int x;
        //int  x is not acceess in main method therefor we get x as public; to geter method

        public int getX() {
            return x;
        }

        //set the value of x

        public void setX(int x) {
            this.x = x;
            System.out.println(x);
        }
        //java bean have constructor method as well as default;
        JavaBean(){
            System.out.println("defaunt constructor");
        }
    }

    /*
    *  ## java bean and pojo rule;

      1=> It is a reusable, purely encapsulated java class which should have following properties:
      2=> The class must be public
      3=>All the fields should be private.
      4=>For each field there should be corresponding public getter and setter method.
      5=> It should have zero argument constructor.
      6=>It may have parameterized constructor (it is not the minimum requirement)

    * */
