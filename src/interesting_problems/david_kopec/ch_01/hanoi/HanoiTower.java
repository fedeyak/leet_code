package interesting_problems.david_kopec.ch_01.hanoi;

// Для модели башни подходит стек
// Имеем три башни, a, b и с
// Башня для 1 диска
//  - строим башню из 1 диска на башне с
// Башня из 2х дисков
//  - строим башню из 1 диска на башне b
//  - перемещаем 2й диск с башни а на башню с
//  - перемещаем башню b на башню с
// Башня из 3х дисков
//  - строим башню из (3-1) дисков на башне b
//  - перемещаем 3й диск на башню с
//  - перемещаем башню b на башню с
// Башня из n дисков
// - строим башню из (n-1) дисков на башне b
// - для этого строим башню из (n-2) на башне c

import java.util.Stack;

public class HanoiTower {
    private final int numDisks;
    public final Stack<Integer> towerA = new Stack<>();
    public final Stack<Integer> towerB = new Stack<>();
    public final Stack<Integer> towerC = new Stack<>();

    public HanoiTower(int discs) {
        numDisks = discs;
        for (int i = 1; i <= discs; i++) {
            towerA.push(i);
        }
    }

    private void exchange(int disks,
                          Stack<Integer> basicTower,
                          Stack<Integer> transitionalTower,
                          Stack<Integer> targetTower) {
        if (disks == 1) {
            targetTower.push(basicTower.pop());
        } else {
            exchange(disks - 1, basicTower, targetTower, transitionalTower);
            exchange(1, basicTower, transitionalTower, targetTower);
            exchange(disks - 1, transitionalTower, basicTower, targetTower);
        }
    }

    public void solve() {
        exchange (numDisks, towerA, towerB, towerC);
    }

    public static void main(String[] args) {
        HanoiTower hanoi = new HanoiTower(2);
        hanoi.solve();
        System.out.println(hanoi.towerA);
        System.out.println(hanoi.towerB);
        System.out.println(hanoi.towerC);
    }
}
