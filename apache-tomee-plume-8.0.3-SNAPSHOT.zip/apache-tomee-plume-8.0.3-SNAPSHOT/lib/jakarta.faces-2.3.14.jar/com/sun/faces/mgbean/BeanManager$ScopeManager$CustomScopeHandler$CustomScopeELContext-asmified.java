package asm.com.sun.faces.mgbean;
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
public class BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", null, "jakarta/el/ELContext", null);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager", "com/sun/faces/mgbean/BeanManager", "ScopeManager", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler", "com/sun/faces/mgbean/BeanManager$ScopeManager", "CustomScopeHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler", "CustomScopeELContext", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "delegate", "Ljakarta/el/ELContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/el/ELContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/el/ELContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "putContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getContext", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocale", "(Ljava/util/Locale;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "setLocale", "(Ljava/util/Locale;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getELResolver", "()Ljakarta/el/ELResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getELResolver", "()Ljakarta/el/ELResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFunctionMapper", "()Ljakarta/el/FunctionMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getFunctionMapper", "()Ljakarta/el/FunctionMapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVariableMapper", "()Ljakarta/el/VariableMapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/mgbean/BeanManager$ScopeManager$CustomScopeHandler$CustomScopeELContext", "delegate", "Ljakarta/el/ELContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ELContext", "getVariableMapper", "()Ljakarta/el/VariableMapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
