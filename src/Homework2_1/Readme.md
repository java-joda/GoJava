#Задание 1#

##Условие##

**Input: array with size = 10 can be of one of two data types: int and double. Calculate:**

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

Функция __modulus__, вне зависимости от того, принимает int[] или double[], вернет double. Это сделано, чтобы при
делении на 0 возвращалось NaN.


##Результат##

###ТЕСТ 1. Разные числа###
int array:
[-1, 2, 5, 10, 2, 3, 7, 8, 4, 9]
double array:
[-1.0, 2.0, 5.0, 10.0, 2.0, 3.0, 7.0, 8.0, 4.0, 9.0]

sum
49
49.0
min
-1
-1.0
max
10
10.0
maxPositive
10
10.0
modulus
-1.0
-1.0
secondLargest
9
9.0

###ТЕСТ 2. Все отрицательные###
int array:
[-1, -2, -5, -10, -2, -3, -7, -8, -4, -9]
double array:
[-1.0, -2.0, -5.0, -10.0, -2.0, -3.0, -7.0, -8.0, -4.0, -9.0]

sum
-51
-51.0
min
-10
-10.0
max
-1
-1.0
maxPositive
0
0.0
modulus
-1.0
-1.0
secondLargest
-2
-2.0

###ТЕСТ 3. Массив нулей###
int array:
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
double array:
[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

sum
0
0.0
min
0
0.0
max
0
0.0
maxPositive
0
0.0
modulus
NaN
NaN
secondLargest
0
0.0

###ТЕСТ 4. Другой массив разных чисел###
int array:
[16, 2, 5, 4, -8, -6, 4, 1, 0, 7]
double array:
[16.0, 2.0, 5.0, 4.0, -8.0, -6.0, 4.0, 1.0, 0.0, 7.0]

sum
25
25.0
min
-8
-8.0
max
16
16.0
maxPositive
16
16.0
modulus
2.0
2.0
secondLargest
7
7.0