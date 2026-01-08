public class Task1_9 {
    public static void main(String[] args) {
        Iphone ip = new Iphone();

        ip.equals1("X", "Black");

    }

    static class Iphone {
        String model;
        String color;
        void equals1(String model, String color) {
                    if (model == null || color == null) {
                        System.out.println(false);
                        return;
                    }

                    else  if (color == model && model==color) {
                            System.out.println(true);
                        }else{
                        System.out.println(false);
                    }

                    }
                }




        }


