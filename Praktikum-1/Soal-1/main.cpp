#include <iostream>
#include "Polinom.hpp"

int main(){
    Polinom P(5);
    P.input();
    P.print();
    std::cout << P.substitute(1);
    return 0;
}