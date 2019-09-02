### 工厂模式


    核心：提供一个创建对象的功能，不需要关系其具体实现。
    
1. 简单工厂

    降低了模块间的耦合度，在MainActivity中通过Factory来创建UserInfo对象，但是不去关系UserInfo具体是怎么被创建出来的