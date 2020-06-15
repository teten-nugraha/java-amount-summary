public class AmountUtilsTest extends AbstractUtilTest {

    @Test
    public void testThousand_1() {
        final String input = "4000";
        final String expected = "4K";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testThousand_2() {
        final String input = "42000";
        final String expected = "42K";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testThousand_3() {
        final String input = "422000";
        final String expected = "422K";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testMillion_1() {
        final String input = "4000000";
        final String expected = "4M";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testMillion_2() {
        final String input = "42000000";
        final String expected = "42M";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testMillion_3() {
        final String input = "422000000";
        final String expected = "422M";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testBillion_1() {
        final String input = "4000000000";
        final String expected = "4B";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testBillion_2() {
        final String input = "43000000000";
        final String expected = "43B";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testBillion_3() {
        final String input = "473000000000";
        final String expected = "473B";
        final String result = AmountUtils.summary(input);

        MatcherAssert.assertThat(result, Matchers.equalTo(expected));

    }

}