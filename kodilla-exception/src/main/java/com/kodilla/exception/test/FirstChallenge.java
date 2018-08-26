package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = -1;
        boolean error = false;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException ae) {
            error = true;
            System.out.println("Something bad happened - are you dividing by 0!?");
        } finally {
            if(error) System.out.println("Dividing 'a' by 'b' finished with error :(");
            else System.out.println("Dividing finished - result: "+result);
        }

    }

}