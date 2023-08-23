package com.dreamtank.idea;

public class TargetProxy implements ITarget{
    private ITarget target;
    public TargetProxy(ITarget target){
        this.target = target;
    }

    public void show(){
        target.show();
    }
}
