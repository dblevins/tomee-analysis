package asm.org.apache.johnzon.jsonb.factory;
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
public class CdiJohnzonAdapterFactory$CdiInstanceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance<TT;>;", "java/lang/Object", new String[] { "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance" });

classWriter.visitInnerClass("org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "CdiInstance", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance", "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory", "Instance", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "context", "Ljavax/enterprise/context/spi/CreationalContext;", "Ljavax/enterprise/context/spi/CreationalContext<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", "(TT;Ljavax/enterprise/context/spi/CreationalContext<Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "value", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "context", "Ljavax/enterprise/context/spi/CreationalContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "context", "Ljavax/enterprise/context/spi/CreationalContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/CreationalContext", "release", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;Lorg/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "<init>", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
