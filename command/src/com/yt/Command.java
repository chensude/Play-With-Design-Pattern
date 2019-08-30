package com.yt;

public abstract class Command  {
    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();

    protected GodeGroup cg = new GodeGroup();

    public abstract void execute() ;


}
