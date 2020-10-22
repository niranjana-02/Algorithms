a=int(input('input a='))
b=int(input('input b='))
c=int(input('input c='))

D=(b*b)-(4*a*c)
if D<0:
    print('no roots')
elif D==0:
    x1 = (-b + (D**0.5))/(2*a)
    print('x1=',x1)
else:
    x1 = (-b + (D**0.5))/(2*a)
    x2 = (-b - (D**0.5))/(2*a)
    print('x1=',x1)
    print('x2=',x2)
   
input()
