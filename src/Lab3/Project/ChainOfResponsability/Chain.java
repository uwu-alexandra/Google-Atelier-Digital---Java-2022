package Lab3.Project.ChainOfResponsability;

public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}
