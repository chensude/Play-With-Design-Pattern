#### 模版模式
![模版方法](img/template.jpg)
总结一下模板方法模式，模板方法模式就是在模板方法中按照一个的规则和顺序调用基本方法， 具体到我们上面那个例子就是 run 方法按照规定的顺序(先调用 start,然后再调用 engineBoom，再调用 alarm，最后调用 stop)调用本类的其他方法，并且由 isAlarm 方法的返回值确定 run 中的执行顺序变更