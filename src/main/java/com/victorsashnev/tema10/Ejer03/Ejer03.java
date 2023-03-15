package com.victorsashnev.tema10.Ejer03;
import java.util.Random;
public class Ejer03 {
        public <GenericStack> Ejer03() {
                GenericStack<String> genericStack = new GenericStack<>(5);
                Random random = new Random();
                System.out.println(genericStack);
                for (int i = 0; i < 10; i++) {
                        genericStack.push("Valor " + i);
                }
                System.out.println(genericStack);
                for (int i = 0; i < 10; i++) {
                        double value = random.nextInt(10);
                        if (random.nextBoolean()) {
                                System.out.printf("Encolando %.2f\n", value);
                                genericStack.push("Valor " + value);
                        } else {
                                System.out.printf("Desencolando %.2f\n", genericStack.pop());
                        }
                        System.out.println(genericStack);
                        System.out.println(genericStack.toDebugString());
                }
                System.out.println(genericStack);
                System.out.println(genericStack.toDebugString());
        }

}
