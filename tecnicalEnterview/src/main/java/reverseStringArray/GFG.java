package reverseStringArray;

import java.util.*;
public class GFG {
	// La funcion print regresa el segundo mayor elemento

	static void print2largest(int arr[],
							int arr_size)
	{
	int i, first, second;

	// Deben de haber al menos dos elementos

	if (arr_size < 2)
	{
		System.out.printf(" Invalid Input ");
		return;
	}

	// Mostramos el arreglo

	Arrays.sort(arr);

	// Empieza por el segundo más largo
	// el elemento más grande es el último

	for (i = arr_size - 2; i >= 0; i--)
	{
		// sí el elemento no es igual al segundo mayor elemento
		
		if (arr[i] != arr[arr_size - 1])
		{
		System.out.printf("The second largest " +
							"element is %d\n", arr[i]);
		return;
		}
	}

	System.out.printf("There is no second " +
						"largest element\n");
	}

	// Corremos el código

	public static void main(String[] args)
	{
	int arr[] = {100, 14, 46, 47, 94, 89, 94, 52, 86, 36, 100, 94, 89};
	int n = arr.length;
	print2largest(arr, n);
	}
	


}
