#Задание 1#

##Условие##

***Input: array with size = 10 can be of one of two data types: int and double. Calculate:***

    sum
    min/max
    max positive
    multiplication
    modulus of first and last element
    second largest element

***As a result you should have methods with following names :***

    sum(int array[]), sum(double[])
    min(int array[]), min(double[])
    max(int array[]), max(double[])
    maxPositive(int array[]), maxPositive(double array[]),
    multiplication  (int array[]), multiplication (double[])
    modulus(int array[]), modulus(double[])
    secondLargest(int array[]), secondLargest(double[])

##Примечания к выполнению##

Функция ***modulus***, вне зависимости от того, принимает int[] или double[], вернет double. Это сделано, чтобы при
делении на 0 возвращалось NaN.


##Результат##

###ТЕСТ 1. Разные числа###
***int array:***
[-1, 2, 5, 10, 2, 3, 7, 8, 4, 9]
***double array:***
[-1.0, 2.0, 5.0, 10.0, 2.0, 3.0, 7.0, 8.0, 4.0, 9.0]

***sum***

intArray: 49; doubleArray: 49.0

***min***

intArray: -1; doubleArray: -1.0

***max***

intArray: 10; doubleArray: 10.0

***maxPositive***

intArray: 10; doubleArray: 10.0

***modulus***

intArray: -1.0; doubleArray: -1.0

***secondLargest***

intArray: 9; doubleArray: 9.0

###ТЕСТ 2. Все отрицательные###

***int array:***

[-1, -2, -5, -10, -2, -3, -7, -8, -4, -9]

***double array:***

[-1.0, -2.0, -5.0, -10.0, -2.0, -3.0, -7.0, -8.0, -4.0, -9.0]

***sum***

intArray: -51; doubleArray: -51.0

***min***

intArray: -10; doubleArray: -10.0

***max***

intArray: -1; doubleArray: -1.0

***maxPositive***

intArray: 0; doubleArray: 0.0

***modulus***

intArray: -1.0; doubleArray: -1.0

***secondLargest***

intArray: -2; doubleArray: -2.0

###ТЕСТ 3. Массив нулей###

***int array:***

[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

***double array:***

[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

***sum***

intArray: 0; doubleArray: 0.0

***min***

intArray: 0; doubleArray: 0.0

***max***

intArray: 0; doubleArray: 0.0

***maxPositive***

intArray: 0; doubleArray: 0.0

***modulus***

intArray: NaN; doubleArray: NaN

***secondLargest***

intArray: 0; doubleArray: 0.0

###ТЕСТ 4. Другой массив разных чисел###
***int array:***

[16, 2, 5, 4, -8, -6, 4, 1, 0, 7]

***double array:***

[16.0, 2.0, 5.0, 4.0, -8.0, -6.0, 4.0, 1.0, 0.0, 7.0]

***sum***

intArray: 25; doubleArray: 25.0

***min***

intArray: -8; doubleArray: -8.0

***max***

intArray: 16; doubleArray: 16.0

***maxPositive***

intArray: 16; doubleArray: 16.0

***modulus***

intArray: 2.0; doubleArray: 2.0

***secondLargest***

intArray: 7; doubleArray: 7.0