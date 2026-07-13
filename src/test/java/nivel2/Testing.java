package nivel2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class Testing {

    @ParameterizedTest
    @CsvSource ( {"1, 1", "2, 2", "3, 3"})
    void sholdBeTrue (int a, int b){
        assertThat(a).isEqualTo(b);
    }

    @ParameterizedTest
    @CsvSource ({"1, 2", "2, 4", "3, 6"})
    void sholdNotBeTrue (int a, int b){
        assertThat(a).isNotEqualTo(b);
    }

    @Test
    void sholdBeTheSame(){
        Object a = new Object();
        Object b = a;

        assertThat(a).isSameAs(b);
    }

    @Test
    void sholdNotBeTheSame(){
        Object a = new Object();
        Object b = new Object();

        assertThat(a).isNotSameAs(b);
    }

    @Test
    void shouldBeTheSameArray(){
        String[] arrayA= {"Barça", "U.D Las Palmas"};
        String[] arrayB= {"Barça", "U.D Las Palmas"};

        assertThat(arrayA).containsExactly(arrayB);
    }

    @Test
    void shouldContainIt(){
        ArrayList<Object> list = new ArrayList<>();
        int number = 9;
        char letter = 'C';
        boolean bool = true;
        String string = "ABCD";

        list.add(number);
        list.add(letter);
        list.add(bool);

        assertThat(list).containsExactly(number, letter, bool);
        assertThat(list).containsExactlyInAnyOrder(bool, number, letter);
        assertThat(list).containsOnlyOnce(number);
        assertThat(list).hasExactlyElementsOfTypes(Integer.class, Character.class, Boolean.class);
        assertThat(list).doesNotHaveAnyElementsOfTypes(String.class);
    }

    @Test
    void mapsTest (){
        HashMap <String, Integer> mapToTest = new HashMap<>();
        mapToTest.put("Barça", 1);
        mapToTest.put("R.Madrid", 2);

        assertThat(mapToTest).containsEntry("Barça", 1);
        assertThat(mapToTest).doesNotContainEntry("Barça", 2);
        assertThat(mapToTest).containsKey("Barça");
    }
    @Test
    void shouldThrowException (){
        Integer[] list = {1, 2};

        assertThatThrownBy(() -> {
            Integer numb = list[2];})
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
    // OUT OF BOUNDS Aranzazu

    @Test
    void optionalEmpty(){
        Optional<String> opTionalObject = Optional.empty();

        assertThat(opTionalObject).isEmpty();
    }



}
