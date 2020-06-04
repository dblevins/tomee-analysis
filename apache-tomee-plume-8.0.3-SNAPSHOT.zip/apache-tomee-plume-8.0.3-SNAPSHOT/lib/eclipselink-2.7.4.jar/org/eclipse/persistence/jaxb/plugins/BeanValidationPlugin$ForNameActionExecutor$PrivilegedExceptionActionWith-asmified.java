package asm.org.eclipse.persistence.jaxb.plugins;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class BeanValidationPlugin$ForNameActionExecutor$PrivilegedExceptionActionWithDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ForNameActionExecutor$PrivilegedExceptionActionWith", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<TT;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ForNameActionExecutor", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "ForNameActionExecutor", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ForNameActionExecutor$PrivilegedExceptionActionWith", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ForNameActionExecutor", "PrivilegedExceptionActionWith", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "with", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction;", "(Ljava/lang/String;)Ljava/security/PrivilegedExceptionAction<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
