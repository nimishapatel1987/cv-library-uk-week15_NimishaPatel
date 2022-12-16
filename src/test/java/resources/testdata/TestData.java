package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "JobSearch")
    public Object[][] getData() {

        String[][] data = new String[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Tester", "Telford", "up to 10 miles", "20000", "400000", "Per annum", "Permanent", "Permanent Tester jobs in Telford"},
                {"Tester", "London", "up to 2 miles", "30000", "200000", "Per anuum", "Permanent", "Permanent Tester jobs in London"},
                {"Administration Assistant", "Telford", "up to 5 miles", "25000", "350000", "Permanent", "Permanent Administration Assistant jobs in Telford"},
                {"Cutomer Support", "Kingsbury", "up to 5 miles", "25000", "400000", "Per annum", "Permanent", "Permanent Customer Support jobs in Kingsbury"},
                {"Project Manager", "Harrow on the Hill, Greater London", "up to 5 miles", "25000", "400000", "Per annum", "Permanent", "Permanent Project Manager jobs in Harrow on the Hill"},
                {"Teaching Assistant", "Wolverhampton", "up to 2 miles", "25000", "400000", "Per annum", "Permanent", "Permanent Teaching Assistant jobs in Wolverhampton"}

        };

        return data;
    }
}
