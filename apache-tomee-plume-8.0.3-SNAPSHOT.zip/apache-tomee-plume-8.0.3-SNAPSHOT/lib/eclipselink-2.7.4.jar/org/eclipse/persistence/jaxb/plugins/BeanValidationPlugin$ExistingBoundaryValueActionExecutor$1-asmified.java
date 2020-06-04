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
public class BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1", "Ljava/lang/Object;Lorg/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$PrivilegedActionWith<Ljava/lang/String;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$PrivilegedActionWith" });

classWriter.visitOuterClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor", null, null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "ExistingBoundaryValueActionExecutor", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$PrivilegedActionWith", "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor", "PrivilegedActionWith", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jAnnotationUse", "Lcom/sun/codemodel/JAnnotationUse;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1", "jAnnotationUse", "Lcom/sun/codemodel/JAnnotationUse;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin", "access$6", "(Lcom/sun/codemodel/JAnnotationUse;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "with", "(Lcom/sun/codemodel/JAnnotationUse;)Ljava/security/PrivilegedAction;", "(Lcom/sun/codemodel/JAnnotationUse;)Ljava/security/PrivilegedAction<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1", "jAnnotationUse", "Lcom/sun/codemodel/JAnnotationUse;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/plugins/BeanValidationPlugin$ExistingBoundaryValueActionExecutor$1", "run", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
