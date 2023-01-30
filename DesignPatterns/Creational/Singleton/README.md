1.Only one instance will be available and that will be accessable globally
2.If you add any value in singleton object then that also became global state.

Subclass is not allowed
constructor should not be public

getinstance method should return instance 

Eager singleton:
whenever class is loaded instance will be created

Lazy singleton:
whenever instance creation called(somebody asked) instance will be created