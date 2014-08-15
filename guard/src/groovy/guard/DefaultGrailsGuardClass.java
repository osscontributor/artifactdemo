package guard;

import org.codehaus.groovy.grails.commons.AbstractInjectableGrailsClass;

public class DefaultGrailsGuardClass extends AbstractInjectableGrailsClass implements GrailsGuardClass {
    public DefaultGrailsGuardClass(Class c) {
        super(c, GuardArtefactHandler.TYPE);
    }
}
