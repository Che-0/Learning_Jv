/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class ArreglosYMatrices {
    public static void main(String[] args) {
    int [][] matriz = {{1,2,3},{4,5,6},{7,8,9,10},{11,12,13,14}};
    
    for (int i=0 ; i<matriz.length ; i++)
    {
        for(int j=0 ; j<matriz[i].length ; j++)
        {
        System.out.println(matriz[i][j]);
        }
    }
}
}