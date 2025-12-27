class StackExample {
    void methodA() {
        System.out.println("methodA начал работу");
        methodB();
        System.out.println("methodA завершается");
    }

    void methodB() {
        System.out.println("methodB начал работу");
        methodC();
        System.out.println("methodB завершается");
    }

    void methodC() {
        System.out.println("methodC начал работу");
        System.out.println("methodC завершается");
    }
}