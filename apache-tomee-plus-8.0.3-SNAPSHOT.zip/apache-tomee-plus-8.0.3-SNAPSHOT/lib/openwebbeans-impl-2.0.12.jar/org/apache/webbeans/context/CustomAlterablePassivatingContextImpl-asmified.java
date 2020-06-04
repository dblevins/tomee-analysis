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
public class CustomAlterablePassivatingContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/context/CustomAlterablePassivatingContextImpl", null, "org/apache/webbeans/context/CustomPassivatingContextImpl", new String[] { "javax/enterprise/context/spi/AlterableContext" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/webbeans/container/SerializableBeanVault;Ljavax/enterprise/context/spi/AlterableContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/context/CustomPassivatingContextImpl", "<init>", "(Lorg/apache/webbeans/container/SerializableBeanVault;Ljavax/enterprise/context/spi/Context;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "(Ljavax/enterprise/context/spi/Contextual;)V", "(Ljavax/enterprise/context/spi/Contextual<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomAlterablePassivatingContextImpl", "context", "Ljavax/enterprise/context/spi/Context;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/context/spi/AlterableContext");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/context/CustomAlterablePassivatingContextImpl", "sbv", "Lorg/apache/webbeans/container/SerializableBeanVault;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/SerializableBeanVault", "getSerializableBean", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/Contextual;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/AlterableContext", "destroy", "(Ljavax/enterprise/context/spi/Contextual;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
