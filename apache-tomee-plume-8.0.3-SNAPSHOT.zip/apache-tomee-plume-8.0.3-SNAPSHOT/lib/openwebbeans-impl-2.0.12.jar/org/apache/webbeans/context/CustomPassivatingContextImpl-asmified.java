package asm.org.apache.webbeans.context;
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
public class CustomPassivatingContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/context/CustomPassivatingContextImpl", null, "java/lang/Object", new String[] { "jakarta/enterprise/context/spi/Context" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "sbv", "Lorg/apache/webbeans/container/SerializableBeanVault;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "context", "Ljakarta/enterprise/context/spi/Context;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/container/SerializableBeanVault;Ljakarta/enterprise/context/spi/Context;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "sbv", "Lorg/apache/webbeans/container/SerializableBeanVault;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "context", "Ljakarta/enterprise/context/spi/Context;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljakarta/enterprise/context/spi/Contextual;Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/context/spi/Contextual<TT;>;Ljakarta/enterprise/context/spi/CreationalContext<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "context", "Ljakarta/enterprise/context/spi/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "sbv", "Lorg/apache/webbeans/container/SerializableBeanVault;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/SerializableBeanVault", "getSerializableBean", "(Ljakarta/enterprise/context/spi/Contextual;)Ljakarta/enterprise/context/spi/Contextual;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/Context", "get", "(Ljakarta/enterprise/context/spi/Contextual;Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljakarta/enterprise/context/spi/Contextual;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljakarta/enterprise/context/spi/Contextual<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "context", "Ljakarta/enterprise/context/spi/Context;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "sbv", "Lorg/apache/webbeans/container/SerializableBeanVault;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/SerializableBeanVault", "getSerializableBean", "(Ljakarta/enterprise/context/spi/Contextual;)Ljakarta/enterprise/context/spi/Contextual;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/Context", "get", "(Ljakarta/enterprise/context/spi/Contextual;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScope", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "context", "Ljakarta/enterprise/context/spi/Context;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/Context", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isActive", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomPassivatingContextImpl", "context", "Ljakarta/enterprise/context/spi/Context;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/context/spi/Context", "isActive", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
