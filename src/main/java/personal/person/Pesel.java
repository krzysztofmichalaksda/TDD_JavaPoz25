package personal.person;

public class Pesel {
    final int peselLength = 11;

    int[] peselArray = new int[peselLength];

    public Pesel(String pesel) throws Exception {
        if (pesel.length() != 11) {
            throw new Exception("Pesel has incorrect length!");
        }

        for (int i = 0; i < peselLength; i++) {
            peselArray[i] = Character.getNumericValue(pesel.charAt(i));
        }
    }

    public boolean isCorrect() {
        int controlSum = 9*peselArray[0] + 7*peselArray[1] + 3*peselArray[2] + peselArray[3] +
                9*peselArray[4] + 7*peselArray[5] + 3*peselArray[6] + peselArray[7] +
                9*peselArray[8] + 7*peselArray[9];

        return (controlSum % 10) == peselArray[10];
        //correct 91022406132
    }

    public int getDay() {
        return  peselArray[4] * 10 + peselArray[5];
    }

    public int getMonth() {
        return  peselArray[2] * 10 + peselArray[3];
    }
}
