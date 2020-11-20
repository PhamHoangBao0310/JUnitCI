/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static com.baoph.myjunit.MyFactorial.getCF;
import java.sql.SQLClientInfoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DELL
 */
public class TestFactorial {

    // test parameterize with JUnit 5
    // data set must be static
    public static Integer[][] initDataSet() {
        return new Integer[][]{
            {1, 1}, {2, 2}, {3, 6}, {5, 120}};
    }

    @ParameterizedTest
    @MethodSource("initDataSet")
    public void testSuccefullCasesUsingParam(int input, long expected) {
        assertEquals(expected, getCF(input));
    }

    @Test
    public void testSuccessfullCase() {
        assertEquals(1, getCF(0));
        assertEquals(2, getCF(2));
    }

    // test Exception 
    // cu phap lamdba , nhồi hàm khác vào trong hàm 
    // chỉ đuuọc dùng anonymous trên interface và abstract class
    @Test
    public void testEceptionCase() {
        // check getCF(-5) throw IllegalArgumentException or not

        Executable fCalled = new Executable() {
            @Override
            public void execute() throws Throwable {
                getCF(-5);
            }
        };
//        assertThrows(IllegalArgumentException.class,
//                () -> {
//                    getCF(-5);
//                });
        assertThrows(IllegalArgumentException.class,
                fCalled);
    }

}
